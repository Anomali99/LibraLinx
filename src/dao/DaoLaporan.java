/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JRViewer;
import parsisten.Buku;
import parsisten.DetailBuku;
import parsisten.DetailSkripsi;
import parsisten.Peminjam;
import parsisten.Peminjaman;
import servis.ServiceLaporan;
import servis.ServicePeminjaman;

/**
 *
 * @author fatiq
 */
public class DaoLaporan implements ServiceLaporan {

    private ServicePeminjaman servis = new DaoPeminjaman();

    @Override
    public JasperPrint cetakKta(String id, JPanel jp) {
        String reportPath = "src/report/Kartu.jrxml";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraLinxPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p WHERE p.idPeminjam = :idPeminjam");
        query.setParameter("idPeminjam", id);
        query.setMaxResults(1);
        List<Peminjam> result = query.getResultList();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(result);
        JasperPrint print = null;
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            jp.removeAll();
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(DaoLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        return print;
    }

    @Override
    public JasperPrint laporanPeminjaman(String no) {
        String reportPath = "src/report/LaporanPeminjaman.jrxml";
        Peminjaman p = servis.getByNo(no);
        List<DetailBuku> db = new ArrayList(p.getDetailBukuCollection());
        List<DetailSkripsi> ds = new ArrayList(p.getDetailSkripsiCollection());
        for (DetailSkripsi s : ds) {
            DetailBuku b = new DetailBuku();
            Buku bk = new Buku();
            bk.setIdBuku(s.getSkripsi().getIdSkripsi());
            bk.setJudul(s.getSkripsi().getJudul());
            bk.setBahasa(s.getSkripsi().getBahasa());
            bk.setFotoSampul(s.getSkripsi().getFotoSampul());
            b.setBuku(bk);
            b.setJumlah(s.getJumlah());
            db.add(b);
        }
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraLinxPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(db);
        HashMap<String, Object> par = new HashMap<>();
        par.put("nama", p.getPeminjam().getNama());
        par.put("tgl1", p.getTglPinjam());
        par.put("tgl2", p.getTglKembali());
        JasperPrint print = null;
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            print = JasperFillManager.fillReport(jasperReport, par, dataSource);
        } catch (JRException ex) {
            Logger.getLogger(DaoLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        return print;
    }

    @Override
    public JasperPrint cetakBuku(JPanel jp) {
        String reportPath = "src/report/LaporanBuku.jrxml";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraLinxPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b ORDER BY b.idBuku");
        List<Buku> result = query.getResultList();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(result);
        JasperPrint print = null;
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            jp.removeAll();
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(DaoLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        return print;
    }

    @Override
    public JasperPrint cetakSkripsi(JPanel jp) {
        String reportPath = "src/report/LaporanSkripsi.jrxml";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraLinxPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s ORDER BY s.idSkripsi");
        List<Buku> result = query.getResultList();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(result);
        JasperPrint print = null;
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            jp.removeAll();
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(DaoLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        return print;
    }

    @Override
    public JasperPrint cetakAnggota(JPanel jp) {
        String reportPath = "src/report/LaporanAnggota.jrxml";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraLinxPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p ORDER BY p.idPeminjam");
        List<Buku> result = query.getResultList();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(result);
        JasperPrint print = null;
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            jp.removeAll();
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(DaoLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        return print;
    }

}
