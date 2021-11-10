package com.company;
import java.util.Arrays; // Arrays metotlarını  kullanabilmek için paketimizi tanımladık
public class Main {

    public static void main(String[] args) {
        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        Arrays.fill(liste, 2); // Bir değer(index) aralığı belirtmeden tüm değerleri 2 yapmasını söyledik.
        System.out.println(Arrays.toString(liste)); // Yapmasını istediğimiz durum, listemizin yeni ve son hali olarak kalır.
        // Bu sebeple liste2 adında tekrar listemizi tanımlayacağız.

        int[] liste2 = {15, 1, 99, 8, 7, -22, 11, 2, -49, 52}; // Tanımladık.
        Arrays.fill(liste2, 3, 6, 7); // 3. indexten 6. indexe kadar (6.index dahil değil!!) olan tüm değerleri 7 yapmasını söyledik.
        System.out.println(Arrays.toString(liste2)); //toString metotu ile dizimizin son halini yazdırmasını söyledik.
        Arrays.sort(liste2); // liste2'nin yeni halini büyükten küçüğe sıralamasını söyledik. Parametre olarak liste2'yi aldığımızı parantez içinde belirlterek.
        System.out.println(Arrays.toString(liste2));

        int[] liste3 = {15, 1, 99,8 , 7, -22, 11, 2, -49, 52};
        Arrays.sort(liste3);
        System.out.println(Arrays.toString(liste3));
        int index = Arrays.binarySearch(liste3, 52); //binarySearch metodu ile aradığımız değerin kaçıncı indexte olduğunu bulabiliriz.
        // Fakat bunu yapmadan önce diziyi sort metodu ile büyükten küçüğe sıralamalıyız.
        System.out.println("52'nin indeksi :" + index);

        int[] liste4 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        int[] copyArray = Arrays.copyOf(liste4, 3); //copyOf dizinin yeni boyutunu belirleriz. Boyutu 3 olsun gibi.
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste4, 0,5); // copyOfRange ile ise boyutun aralığını belirleriz.
        // 0. indexten 5. indexe kadar olanları yazdır (5. index dahil değil!!) gibi.
        System.out.println(Arrays.toString(copyOfRangeArray));
        
        int[] list5 = {1, 2, 3};
        int[] list6 = {1, 2, 3};
        int[] list7 = {1, 2, 10};
        System.out.println(Arrays.equals(list5, list6)); // true
        System.out.println(Arrays.equals(list7, list5)); // false
        // Yalnızca iki dizi öbeğini karşılaştırabiliyoruz.

    }
    }




