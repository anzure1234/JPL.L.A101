package fa.training.services;

import fa.training.entities.Book;
import fa.training.entities.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagazineServiceImpl implements MagazineService {
    public List<Magazine> magazines = new ArrayList<>();

    @Override
    public void addMagazine() {
        Scanner sc = new Scanner(System.in);
        Magazine magazine = new Magazine();
        System.out.println("Enter author: ");
        magazine.setAuthor(sc.nextLine());
        System.out.println("Enter volumn");
        magazine.setVolumn(sc.nextInt());
        System.out.println("Enter edition");
        magazine.setEdition(sc.nextInt());
        System.out.println("Enter publication year: ");
        magazine.setPublicationYear(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter publisher: ");
        magazine.setPublisher(sc.nextLine());
        magazines.add(magazine);
        System.out.println("Add magazine successfully");
    }

    @Override
    public void displayTop10MagazineByVolume() {
        if (magazines.isEmpty()) {
            System.out.println("No magazine");
        } else {
            magazines.sort((o1, o2) -> o2.getVolumn() - o1.getVolumn());
            System.out.println("Top 10 magazines by volume:");
            int count = 0;
            for (Magazine magazine : magazines) {
                System.out.println(magazine.toString());
                count++;
                if (count == 10 || count == magazines.size()) {
                    break;
                }

            }
        }
    }
}
