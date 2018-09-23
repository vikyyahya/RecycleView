package com.vikyyahya.recycleview;

import java.util.ArrayList;

public class PahlawanData {

    public static String [][] data = new String[][]{
            {"Kyai Haji Ahmad Dahlan","Pahlawan dari Yogyakarta","Yogyakarta, 1 Agustus 1868","Yogyakarta, 23 Februari",
                    "Beliau adalah putra keempat dari tujuh bersaudara dari keluarga K.H. Abu Bakar. KH Abu Bakar adalah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. ",
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg"},
            {"Ahmad Yani","Pahlawan dari Purworejo","Purworejo, 19 juni 1922","Jakarta, 1 Oktober1965",
            "Beliau adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya. ",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3f/Ahmad_Yani.jpg"},
            {"Sultan Hasanuddin","Pahlawan dari Gowa","Gowa, 12 Januari 1631","Gowa, 12 Juni 1670",
            "Beliau adalah Raja Gowa ke-16 dan pahlawan nasional Indonesia yang terlahir dengan nama I Mallombasi Muhammad Bakir Daeng Mattawang Karaeng Bonto Mangape sebagai nama pemberian dari Qadi Islam Kesultanan Gowa yakni Syeikh Sayyid Jalaludin bin Ahmad Bafaqih Al-Aidid, seorang mursyid tarekat Baharunnur Baalwy Sulawesi Selatan sekaligus guru tarekat dari Syeikh Yusuf dan Sultan Hasanuddin. Setelah menaiki Tahta sebagai Sultan, ia mendapat tambahan gelar Sultan Hasanuddin Tumenanga Ri Balla Pangkana, hanya saja lebih dikenal dengan Sultan Hasanuddin saja. Karena keberaniannya, ia dijuluki De Haantjes van Het Osten oleh Belanda yang artinya Ayam Jantan/Jago dari Timur",
            "https://upload.wikimedia.org/wikipedia/commons/7/78/Stamps_of_Indonesia%2C_053-06.jpg"},
            {"Bendara Pangeran Harya Dipanegara","Pahlawan dari Yogyakarta","Ngayogyakarta Hadiningrat, 11 November 1785","Makasar, 8 Januari 1855",
            "Beliau adalah salah seorang pahlawan nasional Republik Indonesia. Pangeran Diponegoro terkenal karena memimpin Perang Diponegoro/Perang Jawa (1825-1830) melawan pemerintah Hindia Belanda. Perang tersebut tercatat sebagai perang dengan korban paling besar dalam sejarah Indonesia.",
            "https://upload.wikimedia.org/wikipedia/commons/2/2c/Diponegoro.jpg"}
    };
    public static ArrayList<Pahlawan> getListData(){

        Pahlawan pahlawan = null;
        ArrayList<Pahlawan> list = new ArrayList<>();
        for (int i = 0;i< data.length;i++){
            pahlawan = new Pahlawan();
            pahlawan.setName(data[i][0]);
            pahlawan.setRemark(data[i][1]);
            pahlawan.setTglLahir(data[i][2]);
            pahlawan.setTglWafat(data[i][3]);
            pahlawan.setDetail(data[i][4]);
            pahlawan.setFoto(data[i][5]);

            list.add(pahlawan);
        }
            return list;
    }
}
