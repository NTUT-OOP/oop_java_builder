class HouseBuilderTest {

    public static void main(String[] args) {
        House house = new House.HouseBuilder("先鋒大樓").age(1).rooms(100).address("忠孝東路3段1號").build();
        house.printInfo();
    }
}