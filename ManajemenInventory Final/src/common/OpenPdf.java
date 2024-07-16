/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;
/**
 *
 * @author abima
 */
public class OpenPdf {
    public static void OpenById(String id) {
        try {
            String filePath = InventoryUtils.billPath + id + ".pdf";
            File pdfFile = new File(filePath);
            
            if (pdfFile.exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler " + filePath);
            } else {
                JOptionPane.showMessageDialog(null, "File Tidak Ada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
