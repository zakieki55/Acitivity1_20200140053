/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMY.Java.table.data.act1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author muhammad dzaki
 */
@Controller
public class TableController {
    @RequestMapping("/ktpTable")
    
    public String getTable(Model ktp){
        String result = "Data KTP Siswa UMY";
        
        ktp.addAttribute("ktpTable",result);
        
        ArrayList<List<String>> dataktp = new ArrayList<>();
        
        dataktp.add(0,Arrays.asList("ID","Nomor KTP","Nama","Alamat"));
        dataktp.add(1,Arrays.asList("1","72710301155","Dzaki","Palu"));
        dataktp.add(2,Arrays.asList("2","72710301111","Albert","Bekasi"));
        dataktp.add(3,Arrays.asList("3","72710301010","Bertus","Tangerang"));
        dataktp.add(4,Arrays.asList("4","72710301123","Petra","Padang"));
        dataktp.add(5,Arrays.asList("5","72710301146","Jason","Medan"));
        dataktp.add(6,Arrays.asList("6","72710301245","Indra","Pekanbaru"));
        dataktp.add(7,Arrays.asList("7","72710301321","Axcel","Magelang"));
        dataktp.add(8,Arrays.asList("8","72710314523","Sinta","Jakarta"));
        dataktp.add(9,Arrays.asList("9","72710356123","Indah","Aceh"));
        dataktp.add(10,Arrays.asList("10","72710301214","Nurul","Palu"));
        dataktp.add(11,Arrays.asList("11","72710301000","Bunga","Makassar"));
        dataktp.add(12,Arrays.asList("12","72710308989","Akua","Malang"));
        dataktp.add(13,Arrays.asList("13","72710301675","Liasti","Palu"));
        dataktp.add(14,Arrays.asList("14","72710425167","hardianti","Palu"));
        dataktp.add(15,Arrays.asList("15","72710425685","Melati","Padang"));
        dataktp.add(16,Arrays.asList("16","72711231155","Xiao Ne","Balikpapan"));
        dataktp.add(17,Arrays.asList("17","72755661155","Ping Ping","Batam"));
        dataktp.add(18,Arrays.asList("18","72710301155","Tetsuya","Tokyo"));
        dataktp.add(19,Arrays.asList("19","72710301155","Tzu Yu","Seoul"));
        dataktp.add(20,Arrays.asList("20","72710301155","Mina","Seoul"));
        
        
        
        ktp.addAttribute("tabel",dataktp);
        
        return "Viewtabledata";
    }
}
