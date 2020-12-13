package module9_java_advanced_coding.ex_07_magazine;

class Main {

    public static void main(String[] args) {

        Magazine magazine = new Magazine(3);

        System.out.println(magazine.isLoaded());
        magazine.loadBullet("Bullet 1");
        System.out.println(magazine.isLoaded());
        magazine.loadBullet("Bullet 2");
        magazine.loadBullet("Bullet 3");
        magazine.loadBullet("Bullet 4");
        System.out.println(magazine.isLoaded());

        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        System.out.println(magazine.isLoaded());
        System.out.println();

        ListMagazine listMagazine = new ListMagazine(3);

        System.out.println(listMagazine.isLoaded());
        listMagazine.loadBullet("Bullet 1");
        System.out.println(listMagazine.isLoaded());
        listMagazine.loadBullet("Bullet 2");
        listMagazine.loadBullet("Bullet 3");
        listMagazine.loadBullet("Bullet 4");
        System.out.println(listMagazine.isLoaded());

        listMagazine.shot();
        listMagazine.shot();
        listMagazine.shot();
        listMagazine.shot();
        System.out.println(listMagazine.isLoaded());
        System.out.println();

        LinkedListMagazine linkedListMagazine = new LinkedListMagazine(3);

        System.out.println(linkedListMagazine.isLoaded());
        linkedListMagazine.loadBullet("Bullet 1");
        System.out.println(linkedListMagazine.isLoaded());
        linkedListMagazine.loadBullet("Bullet 2");
        linkedListMagazine.loadBullet("Bullet 3");
        linkedListMagazine.loadBullet("Bullet 4");
        System.out.println(linkedListMagazine.isLoaded());

        linkedListMagazine.shot();
        linkedListMagazine.shot();
        linkedListMagazine.shot();
        linkedListMagazine.shot();
        System.out.println(linkedListMagazine.isLoaded());
    }
}
