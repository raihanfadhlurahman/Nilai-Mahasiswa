/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai_mahasiswa;

/**
 *
 * @author ASUS
 */
public class Nilai_Mahasiswa {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nama, grade;
        int Semester, Tugas, Uts, Uas, nilai;
        
        
        Nama = "Revan";
        Semester = 3;
        Tugas = 98*30/100;
        Uts = 93*20/100;
        Uas = 94*50/100;
        
        nilai = Tugas+Uts+Uas;
        
        if (nilai>=90) {
            grade="A";
        }else if (nilai>=80) {
            grade="B";
        }else if (nilai>=70) {
            grade="C";
        } else {
            grade="D"; }
        System.out.println("Nama: " + Nama);
        System.out.println("Semester: " + Semester);
        System.out.println("nilai: " + nilai);
        System.out.println("grade: " + grade);
        System.out.println("===============================");
        
        Nama = "Brilianto";
        Semester = 3;
        Tugas = 99*30/100;
        Uts = 98*20/100;
        Uas = 90*50/100;
        
        nilai = Tugas+Uts+Uas;
        
        if (nilai>=90) {
            grade="A";
        }else if (nilai>=80) {
            grade="B";
        }else if (nilai>=70) {
            grade="C";
        } else {
            grade="D"; }

        System.out.println("Nama: " + Nama);
        System.out.println("Semester: " + Semester);
        System.out.println("nilai: " + nilai);
        System.out.println("grade: " + grade);
        System.out.println("===============================");
        
        Nama = "Raihan";
        Semester = 3;
        Tugas = 90*30/100;
        Uts = 93*20/100;
        Uas = 96*50/100;
        
        nilai = Tugas+Uts+Uas;
        
        if (nilai>=90) {
            grade="A";
        }else if (nilai>=80) {
            grade="B";
        }else if (nilai>=70) {
            grade="C";
        } else {
            grade="D"; }
        
        System.out.println("Nama: " + Nama);
        System.out.println("Semester: " + Semester);
        System.out.println("nilai: " + nilai);
        System.out.println("grade: " + grade);
        System.out.println("===============================");
        }
    }
