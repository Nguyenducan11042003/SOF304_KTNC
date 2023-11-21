/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import Entity.NhanVien;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author nguye
 */
public class NhanVienDAOTest {
    
 private NhanVienDAO nhanVienDAO;

    @Before
    public void setUp() {
        nhanVienDAO = new NhanVienDAO();
    }

      @Test(expected = RuntimeException.class)
    public void testInsert() {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setManv("32");
        nhanVien.setMatkhau("password");
        nhanVien.setHoten("John Doe");
        nhanVien.setVaitro(true);

        // Thực hiện phương thức insert
        nhanVienDAO.insert(nhanVien);

        // Kiểm tra xem NhanVien có được thêm vào cơ sở dữ liệu không
        NhanVien retrievedNhanVien = nhanVienDAO.selectbyId("new1");
        assertNotNull(retrievedNhanVien);
        assertEquals("32", retrievedNhanVien.getManv());
        assertEquals("John Doe", retrievedNhanVien.getHoten());
        assertTrue(retrievedNhanVien.getVaitro());
    }
    @Test(expected = RuntimeException.class)
    public void testInsertWithEmptyFields() {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setManv("");
        nhanVien.setMatkhau("");
        nhanVien.setHoten("");
        nhanVien.setVaitro(true);

        // Thực hiện phương thức insert
        nhanVienDAO.insert(nhanVien);

        // Kiểm tra xem đối tượng NhanVien trả về từ cơ sở dữ liệu có là null không
        NhanVien retrievedNhanVien = nhanVienDAO.selectbyId("");
        assertNull(retrievedNhanVien);
    }
    @Test
    public void testUpdate() {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setManv("NV001");
        nhanVien.setMatkhau("111111");
        nhanVien.setHoten("new");
        nhanVien.setVaitro(false);

        // Thực hiện phương thức update
        nhanVienDAO.update(nhanVien);

        // Kiểm tra xem NhanVien đã được cập nhật trong cơ sở dữ liệu không
        NhanVien updatedNhanVien = nhanVienDAO.selectbyId("NV001");
        assertNotNull(updatedNhanVien);
        assertEquals("new", updatedNhanVien.getHoten());
        assertFalse(updatedNhanVien.getVaitro());
    }

    @Test
    public void testDelete() {
        // Thực hiện phương thức delete
//                NhanVien nhanVien = new NhanVien();
     
        nhanVienDAO.delete("02");

        // Kiểm tra xem NhanVien có bị xóa khỏi cơ sở dữ liệu không
        NhanVien deletedNhanVien = nhanVienDAO.selectbyId("02");
        assertNull(deletedNhanVien);
//        assertTrue(deletedNhanVien.getVaitro());

    }

    @Test
    public void testSelectById() {
        // Kiểm tra phương thức selectbyId
        NhanVien nhanVien = nhanVienDAO.selectbyId("NV001");
        assertNotNull(nhanVien);
        assertEquals("NV001", nhanVien.getManv());
    }

    @Test
    public void testSelectAll() {
        // Kiểm tra phương thức selectAll
        List<NhanVien> nhanVienList = nhanVienDAO.selectAll();
        assertNotNull(nhanVienList);
        assertFalse(nhanVienList.isEmpty());
    }
    
}
