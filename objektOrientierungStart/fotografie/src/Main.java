void main() {
    Lens lensCanon = new Lens(18, 55);
    Lens lensSony = new Lens(24, 70);
    Lens lensNikon = new Lens(200, 70);
    System.out.println("lensNikon = " + lensNikon);

    Camera canonCamera = new Camera("Canon", 24, 3, true, lensCanon);
    Camera sonyCamera = new Camera("Sony", 33, 3, true, lensSony);
    Camera nikonCamera = new Camera("Nikon", 20, 2, false, lensNikon);

    System.out.println(canonCamera);

    System.out.println("-".repeat(67));

    System.out.println("Changing Sony lens");
    sonyCamera.setLens(new Lens(50, 150));
    System.out.println("sonyCamera = " + sonyCamera);

    System.out.println("-".repeat(67));

    System.out.println("Camera.counter = " + Camera.counter);
    System.out.println("Lens.counter = " + Lens.counter);
}