package com.htnameh.kata;

import java.util.*;

/**
 * @author hemanth
 * @since 22/1/19
 */
public class ColouredTriangles {

    public static void main(String[] args) {
        List<ColouredPoint> lstArguments1 = Arrays.asList(new ColouredPoint(new int[]{3, -4}, "blue"),
                new ColouredPoint(new int[]{-7, -1}, "red"),
                new ColouredPoint(new int[]{7, -6}, "yellow"),
                new ColouredPoint(new int[]{2, 5}, "yellow"),
                new ColouredPoint(new int[]{1, -5}, "red"),
                new ColouredPoint(new int[]{-1, 4}, "red"),
                new ColouredPoint(new int[]{1, 7}, "red"),
                new ColouredPoint(new int[]{-3, 5}, "red"),
                new ColouredPoint(new int[]{-3, -5}, "blue"),
                new ColouredPoint(new int[]{4, 1}, "blue"));

        List<ColouredPoint> lstArguments2 = Arrays.asList(new ColouredPoint(new int[]{3, -4}, "blue"),
                new ColouredPoint(new int[]{-7, -1}, "red"),
                new ColouredPoint(new int[]{7, -6}, "yellow"),
                new ColouredPoint(new int[]{2, 5}, "yellow"),
                new ColouredPoint(new int[]{1, -5}, "red"),
                new ColouredPoint(new int[]{1, 1}, "red"),
                new ColouredPoint(new int[]{1, 7}, "red"),
                new ColouredPoint(new int[]{1, 4}, "red"),
                new ColouredPoint(new int[]{-3, -5}, "blue"),
                new ColouredPoint(new int[]{4, 1}, "blue"));

        List<ColouredPoint> lstArguments3 = Arrays.asList(new ColouredPoint(new int[]{1, -2}, "red"),
                new ColouredPoint(new int[]{7, -6}, "yellow"),
                new ColouredPoint(new int[]{2, 5}, "yellow"),
                new ColouredPoint(new int[]{1, -5}, "red"),
                new ColouredPoint(new int[]{1, 1}, "red"),
                new ColouredPoint(new int[]{1, 7}, "red"),
                new ColouredPoint(new int[]{1, 4}, "red"),
                new ColouredPoint(new int[]{-3, -5}, "blue"),
                new ColouredPoint(new int[]{4, 1}, "blue"));

        List<ColouredPoint> lstArguments4 = Arrays.asList(new ColouredPoint(new int[]{60, -86}, "gray"),
                new ColouredPoint(new int[]{48, -87}, "green"),
                new ColouredPoint(new int[]{32, 54}, "golden"),
                new ColouredPoint(new int[]{72, -48}, "white"),
                new ColouredPoint(new int[]{41, 7}, "white"),
                new ColouredPoint(new int[]{99, -43}, "green"),
                new ColouredPoint(new int[]{-74, 36}, "lime"),
                new ColouredPoint(new int[]{-33, -88}, "white"),
                new ColouredPoint(new int[]{29, -52}, "golden"),
                new ColouredPoint(new int[]{-35, 89}, "gray"),
                new ColouredPoint(new int[]{32, 27}, "lime"),
                new ColouredPoint(new int[]{-39, 74}, "lime"),
                new ColouredPoint(new int[]{14, 49}, "white"),
                new ColouredPoint(new int[]{4, 12}, "green"),
                new ColouredPoint(new int[]{8, 51}, "green"),
                new ColouredPoint(new int[]{-82, -83}, "lime"),
                new ColouredPoint(new int[]{-33, -67}, "white"),
                new ColouredPoint(new int[]{-5, -95}, "golden"),
                new ColouredPoint(new int[]{-40, -13}, "white"),
                new ColouredPoint(new int[]{-81, -85}, "green"),
                new ColouredPoint(new int[]{-25, 72}, "golden"),
                new ColouredPoint(new int[]{-78, -44}, "golden"),
                new ColouredPoint(new int[]{61, -40}, "golden"),
                new ColouredPoint(new int[]{-27, 14}, "gray"),
                new ColouredPoint(new int[]{-26, 47}, "green"),
                new ColouredPoint(new int[]{-29, -86}, "white"),
                new ColouredPoint(new int[]{9, 2}, "green"),
                new ColouredPoint(new int[]{-46, 96}, "green"),
                new ColouredPoint(new int[]{75, 64}, "gray"),
                new ColouredPoint(new int[]{48, -44}, "lime"),
                new ColouredPoint(new int[]{-31, -90}, "golden"),
                new ColouredPoint(new int[]{67, 77}, "lime"),
                new ColouredPoint(new int[]{52, -28}, "white"),
                new ColouredPoint(new int[]{1, -56}, "gray"),
                new ColouredPoint(new int[]{-93, -57}, "gray"),
                new ColouredPoint(new int[]{-51, -32}, "gray"),
                new ColouredPoint(new int[]{92, 28}, "lime"),
                new ColouredPoint(new int[]{2, -28}, "lime"),
                new ColouredPoint(new int[]{42, 39}, "green"),
                new ColouredPoint(new int[]{3, 48}, "golden"),
                new ColouredPoint(new int[]{-62, -28}, "white"),
                new ColouredPoint(new int[]{17, 23}, "green"),
                new ColouredPoint(new int[]{-79, -6}, "golden"),
                new ColouredPoint(new int[]{-62, -33}, "golden"),
                new ColouredPoint(new int[]{36, 28}, "green"),
                new ColouredPoint(new int[]{-3, -82}, "golden"),
                new ColouredPoint(new int[]{-31, -23}, "lime"),
                new ColouredPoint(new int[]{-77, 46}, "white"),
                new ColouredPoint(new int[]{-89, -98}, "white"),
                new ColouredPoint(new int[]{83, -40}, "green"),
                new ColouredPoint(new int[]{0, 45}, "lime"),
                new ColouredPoint(new int[]{15, 47}, "golden"),
                new ColouredPoint(new int[]{25, -15}, "gray"),
                new ColouredPoint(new int[]{82, -17}, "gray"),
                new ColouredPoint(new int[]{39, 90}, "golden"),
                new ColouredPoint(new int[]{-31, -16}, "gray"),
                new ColouredPoint(new int[]{21, 11}, "gray"),
                new ColouredPoint(new int[]{87, -28}, "golden"),
                new ColouredPoint(new int[]{-17, 51}, "gray"),
                new ColouredPoint(new int[]{68, 16}, "green"),
                new ColouredPoint(new int[]{-53, 44}, "green"),
                new ColouredPoint(new int[]{12, 46}, "green"),
                new ColouredPoint(new int[]{40, 13}, "lime"),
                new ColouredPoint(new int[]{85, -16}, "lime"),
                new ColouredPoint(new int[]{-30, -65}, "golden"),
                new ColouredPoint(new int[]{-46, -82}, "lime"),
                new ColouredPoint(new int[]{-41, -91}, "gray"),
                new ColouredPoint(new int[]{-85, 96}, "lime"),
                new ColouredPoint(new int[]{19, -84}, "gray"),
                new ColouredPoint(new int[]{86, 50}, "gray"),
                new ColouredPoint(new int[]{-46, 11}, "white"),
                new ColouredPoint(new int[]{-30, 51}, "white"),
                new ColouredPoint(new int[]{-20, 96}, "gray"),
                new ColouredPoint(new int[]{-32, 28}, "lime"),
                new ColouredPoint(new int[]{-86, -64}, "lime"),
                new ColouredPoint(new int[]{15, 65}, "lime"),
                new ColouredPoint(new int[]{-43, 29}, "gray"),
                new ColouredPoint(new int[]{-10, -98}, "gray"),
                new ColouredPoint(new int[]{22, -52}, "gray"),
                new ColouredPoint(new int[]{-90, -39}, "gray"),
                new ColouredPoint(new int[]{-70, -99}, "lime"),
                new ColouredPoint(new int[]{0, 29}, "golden"),
                new ColouredPoint(new int[]{-41, 88}, "gray"),
                new ColouredPoint(new int[]{-174, 118}, "cream"),
                new ColouredPoint(new int[]{124, -19}, "green"),
                new ColouredPoint(new int[]{152, -137}, "green"),
                new ColouredPoint(new int[]{191, -162}, "fuchsia"),
                new ColouredPoint(new int[]{-92, -72}, "blue"),
                new ColouredPoint(new int[]{-31, 72}, "orange"),
                new ColouredPoint(new int[]{-38, -16}, "orange"),
                new ColouredPoint(new int[]{181, 91}, "golden"),
                new ColouredPoint(new int[]{159, -10}, "orange"),
                new ColouredPoint(new int[]{142, -14}, "blue"),
                new ColouredPoint(new int[]{-198, -179}, "fuchsia"),
                new ColouredPoint(new int[]{-37, 134}, "cream"),
                new ColouredPoint(new int[]{3, -2}, "green"),
                new ColouredPoint(new int[]{-8, -51}, "green"),
                new ColouredPoint(new int[]{-49, 88}, "green"),
                new ColouredPoint(new int[]{-162, -190}, "cream"),
                new ColouredPoint(new int[]{-12, -143}, "silver"),
                new ColouredPoint(new int[]{90, -33}, "green"),
                new ColouredPoint(new int[]{9, 104}, "silver"),
                new ColouredPoint(new int[]{-157, -18}, "silver"),
                new ColouredPoint(new int[]{49, -46}, "silver"),
                new ColouredPoint(new int[]{-142, 171}, "golden"),
                new ColouredPoint(new int[]{-24, -59}, "cream"),
                new ColouredPoint(new int[]{133, -68}, "fuchsia"),
                new ColouredPoint(new int[]{182, 198}, "green"),
                new ColouredPoint(new int[]{161, 83}, "golden"));

        List<ColouredPoint> lstArguments5 = Arrays.asList(new ColouredPoint(new int[]{-12, -88}, "blue"),
                new ColouredPoint(new int[]{-30, 24}, "silver"),
                new ColouredPoint(new int[]{60, -49}, "silver"),
                new ColouredPoint(new int[]{74, 90}, "blue"),
                new ColouredPoint(new int[]{99, -16}, "blue"),
                new ColouredPoint(new int[]{10, -74}, "silver"),
                new ColouredPoint(new int[]{-82, 84}, "violet"),
                new ColouredPoint(new int[]{99, -26}, "violet"),
                new ColouredPoint(new int[]{2, 83}, "blue"),
                new ColouredPoint(new int[]{46, 20}, "silver"),
                new ColouredPoint(new int[]{22, -33}, "violet"),
                new ColouredPoint(new int[]{-42, 39}, "violet"),
                new ColouredPoint(new int[]{-29, 50}, "blue"),
                new ColouredPoint(new int[]{-88, -79}, "violet"),
                new ColouredPoint(new int[]{3, 64}, "blue"),
                new ColouredPoint(new int[]{-57, 26}, "blue"),
                new ColouredPoint(new int[]{26, 52}, "violet"),
                new ColouredPoint(new int[]{3, 52}, "silver"),
                new ColouredPoint(new int[]{-85, -14}, "violet"),
                new ColouredPoint(new int[]{-30, -154}, "cream"),
                new ColouredPoint(new int[]{-79, 126}, "blue"),
                new ColouredPoint(new int[]{50, -42}, "blue"),
                new ColouredPoint(new int[]{-141, 87}, "green"),
                new ColouredPoint(new int[]{-37, 136}, "green"),
                new ColouredPoint(new int[]{-105, 36}, "green"),
                new ColouredPoint(new int[]{25, -117}, "cream"),
                new ColouredPoint(new int[]{25, 108}, "golden"),
                new ColouredPoint(new int[]{34, 109}, "blue"),
                new ColouredPoint(new int[]{49, 59}, "green"),
                new ColouredPoint(new int[]{154, -49}, "cream"),
                new ColouredPoint(new int[]{125, 67}, "cream"),
                new ColouredPoint(new int[]{-162, 40}, "blue"),
                new ColouredPoint(new int[]{-18, -163}, "green"),
                new ColouredPoint(new int[]{-22, 113}, "green"),
                new ColouredPoint(new int[]{24, 0}, "blue"),
                new ColouredPoint(new int[]{-31, -77}, "cream"),
                new ColouredPoint(new int[]{31, -111}, "golden"),
                new ColouredPoint(new int[]{188, -118}, "green"),
                new ColouredPoint(new int[]{40, 105}, "blue"),
                new ColouredPoint(new int[]{-84, 165}, "golden"),
                new ColouredPoint(new int[]{170, 44}, "cream"),
                new ColouredPoint(new int[]{-179, 15}, "blue"),
                new ColouredPoint(new int[]{-15, 61}, "blue"),
                new ColouredPoint(new int[]{-123, -122}, "green"),
                new ColouredPoint(new int[]{82, 79}, "cream"),
                new ColouredPoint(new int[]{-31, 49}, "blue"),
                new ColouredPoint(new int[]{44, 22}, "blue"),
                new ColouredPoint(new int[]{-131, 185}, "green"),
                new ColouredPoint(new int[]{151, 51}, "green"),
                new ColouredPoint(new int[]{195, -41}, "blue"),
                new ColouredPoint(new int[]{-114, -170}, "golden"),
                new ColouredPoint(new int[]{166, 59}, "blue"),
                new ColouredPoint(new int[]{-89, -120}, "golden"),
                new ColouredPoint(new int[]{67, 13}, "golden"),
                new ColouredPoint(new int[]{-195, 166}, "cream"),
                new ColouredPoint(new int[]{-183, 197}, "cream"),
                new ColouredPoint(new int[]{56, -42}, "green"),
                new ColouredPoint(new int[]{-48, 100}, "green"),
                new ColouredPoint(new int[]{-147, 114}, "green"),
                new ColouredPoint(new int[]{173, -45}, "cream"),
                new ColouredPoint(new int[]{-7, 2}, "golden"),
                new ColouredPoint(new int[]{-3, 125}, "golden"),
                new ColouredPoint(new int[]{90, 185}, "cream"),
                new ColouredPoint(new int[]{75, -41}, "golden"),
                new ColouredPoint(new int[]{125, 58}, "golden"),
                new ColouredPoint(new int[]{24, 155}, "blue"),
                new ColouredPoint(new int[]{-5, -151}, "green"),
                new ColouredPoint(new int[]{-359, -181}, "lime"),
                new ColouredPoint(new int[]{418, -263}, "silver"),
                new ColouredPoint(new int[]{-88, -176}, "lime"),
                new ColouredPoint(new int[]{18, 400}, "silver"),
                new ColouredPoint(new int[]{-458, -158}, "silver"),
                new ColouredPoint(new int[]{305, -145}, "white"),
                new ColouredPoint(new int[]{-73, -68}, "sky_blue"),
                new ColouredPoint(new int[]{279, 53}, "sky_blue"),
                new ColouredPoint(new int[]{256, -376}, "blue"),
                new ColouredPoint(new int[]{-412, 7}, "sky_blue"),
                new ColouredPoint(new int[]{-423, 288}, "white"),
                new ColouredPoint(new int[]{91, 459}, "lime"),
                new ColouredPoint(new int[]{69, -39}, "white"),
                new ColouredPoint(new int[]{232, -429}, "white"),
                new ColouredPoint(new int[]{414, -218}, "blue"),
                new ColouredPoint(new int[]{-137, 204}, "silver"),
                new ColouredPoint(new int[]{-353, 327}, "sky_blue"),
                new ColouredPoint(new int[]{225, 375}, "silver"),
                new ColouredPoint(new int[]{-64, 207}, "sky_blue"),
                new ColouredPoint(new int[]{-360, 297}, "silver"),
                new ColouredPoint(new int[]{26, -335}, "lime"),
                new ColouredPoint(new int[]{-132, 438}, "silver"),
                new ColouredPoint(new int[]{420, -258}, "silver"),
                new ColouredPoint(new int[]{492, -413}, "sky_blue"),
                new ColouredPoint(new int[]{111, 202}, "lime"),
                new ColouredPoint(new int[]{-252, -191}, "silver"),
                new ColouredPoint(new int[]{-214, -446}, "blue"),
                new ColouredPoint(new int[]{-232, 5}, "white"),
                new ColouredPoint(new int[]{168, -498}, "white"),
                new ColouredPoint(new int[]{271, -493}, "sky_blue"),
                new ColouredPoint(new int[]{170, -318}, "white"),
                new ColouredPoint(new int[]{-480, -151}, "white"),
                new ColouredPoint(new int[]{-344, -393}, "white"),
                new ColouredPoint(new int[]{121, -349}, "sky_blue"),
                new ColouredPoint(new int[]{-475, -231}, "lime"),
                new ColouredPoint(new int[]{-24, -259}, "lime"),
                new ColouredPoint(new int[]{326, 237}, "blue"),
                new ColouredPoint(new int[]{-314, -393}, "blue"),
                new ColouredPoint(new int[]{100, 369}, "sky_blue"),
                new ColouredPoint(new int[]{255, -40}, "silver"),
                new ColouredPoint(new int[]{-498, 20}, "sky_blue"),
                new ColouredPoint(new int[]{-465, 170}, "lime"),
                new ColouredPoint(new int[]{232, 125}, "sky_blue"),
                new ColouredPoint(new int[]{-213, 238}, "lime"),
                new ColouredPoint(new int[]{37, -66}, "lime"),
                new ColouredPoint(new int[]{58, 82}, "silver"),
                new ColouredPoint(new int[]{-10, -377}, "blue"),
                new ColouredPoint(new int[]{-474, 285}, "sky_blue"),
                new ColouredPoint(new int[]{-353, 329}, "silver"),
                new ColouredPoint(new int[]{-60, -312}, "silver"),
                new ColouredPoint(new int[]{461, 17}, "lime"),
                new ColouredPoint(new int[]{-40, 170}, "lime"),
                new ColouredPoint(new int[]{-241, -309}, "lime"),
                new ColouredPoint(new int[]{-261, 301}, "blue"),
                new ColouredPoint(new int[]{203, 444}, "brown"),
                new ColouredPoint(new int[]{-126, 724}, "green"),
                new ColouredPoint(new int[]{207, 512}, "cream"),
                new ColouredPoint(new int[]{-129, 716}, "blue"),
                new ColouredPoint(new int[]{-605, -700}, "fuchsia"),
                new ColouredPoint(new int[]{237, 532}, "green"),
                new ColouredPoint(new int[]{252, -250}, "cream"),
                new ColouredPoint(new int[]{-202, 101}, "sky_blue"),
                new ColouredPoint(new int[]{-763, -231}, "fuchsia"),
                new ColouredPoint(new int[]{-154, -533}, "lime"),
                new ColouredPoint(new int[]{-318, -682}, "violet"),
                new ColouredPoint(new int[]{-396, 712}, "fuchsia"),
                new ColouredPoint(new int[]{-114, 43}, "fuchsia"),
                new ColouredPoint(new int[]{-650, -31}, "lime"),
                new ColouredPoint(new int[]{250, -750}, "blue"),
                new ColouredPoint(new int[]{568, -86}, "lime"),
                new ColouredPoint(new int[]{-523, 633}, "brown"),
                new ColouredPoint(new int[]{-746, 240}, "lime"),
                new ColouredPoint(new int[]{-422, -335}, "lime"),
                new ColouredPoint(new int[]{-238, 548}, "sky_blue"),
                new ColouredPoint(new int[]{-522, -283}, "silver"),
                new ColouredPoint(new int[]{765, -174}, "cream"),
                new ColouredPoint(new int[]{-529, 490}, "silver"),
                new ColouredPoint(new int[]{-195, 276}, "fuchsia"),
                new ColouredPoint(new int[]{96, 113}, "brown"),
                new ColouredPoint(new int[]{-1, 686}, "blue"),
                new ColouredPoint(new int[]{-129, -398}, "blue"),
                new ColouredPoint(new int[]{211, -105}, "sky_blue"),
                new ColouredPoint(new int[]{451, 395}, "lime"),
                new ColouredPoint(new int[]{24, -793}, "cream"),
                new ColouredPoint(new int[]{-318, 426}, "silver"),
                new ColouredPoint(new int[]{-220, -727}, "cream"),
                new ColouredPoint(new int[]{-510, -117}, "sky_blue"),
                new ColouredPoint(new int[]{-367, 713}, "brown"),
                new ColouredPoint(new int[]{-508, 157}, "lime"),
                new ColouredPoint(new int[]{-664, 290}, "cream"),
                new ColouredPoint(new int[]{505, 773}, "cream"),
                new ColouredPoint(new int[]{514, -423}, "green"),
                new ColouredPoint(new int[]{-351, -531}, "brown"),
                new ColouredPoint(new int[]{412, -298}, "cream"),
                new ColouredPoint(new int[]{-109, 129}, "silver"),
                new ColouredPoint(new int[]{-322, -768}, "blue"),
                new ColouredPoint(new int[]{-539, 661}, "blue"),
                new ColouredPoint(new int[]{49, -368}, "sky_blue"),
                new ColouredPoint(new int[]{243, -48}, "cream"),
                new ColouredPoint(new int[]{469, -676}, "cream"),
                new ColouredPoint(new int[]{69, 529}, "fuchsia"),
                new ColouredPoint(new int[]{487, 499}, "fuchsia"),
                new ColouredPoint(new int[]{-444, -192}, "lime"),
                new ColouredPoint(new int[]{-709, -213}, "blue"),
                new ColouredPoint(new int[]{-634, 547}, "blue"),
                new ColouredPoint(new int[]{640, -331}, "fuchsia"),
                new ColouredPoint(new int[]{-216, 184}, "green"),
                new ColouredPoint(new int[]{-753, -483}, "fuchsia"),
                new ColouredPoint(new int[]{50, 311}, "cream"),
                new ColouredPoint(new int[]{-168, 706}, "lime"),
                new ColouredPoint(new int[]{-447, -601}, "silver"),
                new ColouredPoint(new int[]{446, 700}, "green"),
                new ColouredPoint(new int[]{-327, -17}, "cream"),
                new ColouredPoint(new int[]{-102, -207}, "fuchsia"),
                new ColouredPoint(new int[]{424, -290}, "green"),
                new ColouredPoint(new int[]{-562, 3}, "lime"),
                new ColouredPoint(new int[]{-781, 194}, "lime"),
                new ColouredPoint(new int[]{22, -146}, "blue"),
                new ColouredPoint(new int[]{496, 774}, "brown"),
                new ColouredPoint(new int[]{191, -511}, "green"),
                new ColouredPoint(new int[]{-201, 197}, "brown"),
                new ColouredPoint(new int[]{247, 301}, "lime"),
                new ColouredPoint(new int[]{349, 628}, "cream"),
                new ColouredPoint(new int[]{-556, -272}, "brown"),
                new ColouredPoint(new int[]{-224, -620}, "green"),
                new ColouredPoint(new int[]{-552, -369}, "silver"),
                new ColouredPoint(new int[]{495, 352}, "fuchsia"),
                new ColouredPoint(new int[]{248, -482}, "lime"),
                new ColouredPoint(new int[]{292, -558}, "fuchsia"),
                new ColouredPoint(new int[]{-67, -165}, "lime"),
                new ColouredPoint(new int[]{653, -259}, "blue"),
                new ColouredPoint(new int[]{516, 383}, "violet"),
                new ColouredPoint(new int[]{-38, -299}, "brown"),
                new ColouredPoint(new int[]{39, 419}, "brown"),
                new ColouredPoint(new int[]{-360, 682}, "cream"),
                new ColouredPoint(new int[]{742, -618}, "lime"),
                new ColouredPoint(new int[]{143, -794}, "sky_blue"),
                new ColouredPoint(new int[]{-438, -263}, "fuchsia"),
                new ColouredPoint(new int[]{-234, -178}, "brown"),
                new ColouredPoint(new int[]{-476, -762}, "violet"),
                new ColouredPoint(new int[]{459, 364}, "brown"),
                new ColouredPoint(new int[]{-160, -300}, "cream"),
                new ColouredPoint(new int[]{-193, -54}, "green"),
                new ColouredPoint(new int[]{-186, 705}, "blue"),
                new ColouredPoint(new int[]{-18, -400}, "green"),
                new ColouredPoint(new int[]{-344, 653}, "sky_blue"),
                new ColouredPoint(new int[]{-657, -176}, "green"),
                new ColouredPoint(new int[]{-230, -556}, "brown"),
                new ColouredPoint(new int[]{-150, -124}, "silver"),
                new ColouredPoint(new int[]{304, -8}, "blue"),
                new ColouredPoint(new int[]{-527, -295}, "green"),
                new ColouredPoint(new int[]{25, -42}, "silver"),
                new ColouredPoint(new int[]{548, 518}, "green"));

        // [10, 3, 11, [red], 10]
        // [10, 3, 7, [red], 6]
        // [9, 3, 0, [], 0]
        // [26, 7, 46, [green], 35]
        // [99, 9, 2080, [cream, lime], 455]

//        System.out.println(countColouredTriangles(lstArguments1));
//        System.out.println(countColouredTriangles(lstArguments2));
//        System.out.println(countColouredTriangles(lstArguments3));
//        System.out.println(countColouredTriangles(lstArguments4));
        System.out.println(countColouredTriangles(lstArguments5));
    }

    private static TriangleResult countColouredTriangles(final List<ColouredPoint> lstPts) {
        Map<String, List<int[]>> colorPointsMap = new HashMap<>();
        Map<Integer, List<String>> resultMap = new HashMap<>();

        for (ColouredPoint lstPt : lstPts) {
            if (colorPointsMap.containsKey(lstPt.getColour())) {
                List<int[]> tempList = colorPointsMap.get(lstPt.getColour());
                tempList.add(lstPt.getPosition());
                colorPointsMap.put(lstPt.getColour(), tempList);
            } else {
                List<int[]> tempList = new ArrayList<>();
                tempList.add(lstPt.getPosition());
                colorPointsMap.put(lstPt.getColour(), tempList);
            }
        }

        int totalNumberOfTriangles = 0;
        int maxFromColour = 0;

        for (String color : colorPointsMap.keySet()) {
            int numberOfTrianglesOfAColor = 0;
            List<int[]> points = colorPointsMap.get(color);
            if (points.size() > 2) {
                int size = points.size();
                for (int i = 0; i < size; i++) {
                    int[] point1 = points.get(i);
                    for (int j = i + 1; j < size; j++) {
                        int[] point2 = points.get(j);
                        for (int k = j + 1; k < size; k++) {
                            int[] point3 = points.get(k);
                            if (((point3[1] - point2[1]) * (point2[0] - point1[0]))
                                    != ((point2[1] - point1[1]) * (point3[0] - point2[0]))) {
                                totalNumberOfTriangles++;
                                numberOfTrianglesOfAColor++;
                            }
                        }
                    }
                }
            }

            if (numberOfTrianglesOfAColor >= maxFromColour) {
                maxFromColour = numberOfTrianglesOfAColor;
            }

            if (numberOfTrianglesOfAColor != 0) {
                if (resultMap.containsKey(numberOfTrianglesOfAColor)) {
                    List<String> temp = resultMap.get(numberOfTrianglesOfAColor);
                    temp.add(color);
                    resultMap.put(numberOfTrianglesOfAColor, temp);
                } else {
                    List<String> temp = new ArrayList<>();
                    temp.add(color);
                    resultMap.put(numberOfTrianglesOfAColor, temp);
                }
            }

        }

        List<String> maxTriangleColours = resultMap.get(maxFromColour) == null ? new ArrayList<>() : resultMap.get(maxFromColour);

        Collections.sort(maxTriangleColours);

        return new TriangleResult(lstPts.size(), colorPointsMap.size(), totalNumberOfTriangles, maxTriangleColours, maxFromColour);
    }

    static class ColouredPoint {

        private int[] pos;
        private String color;

        ColouredPoint(final int[] pos, final String color) {
            this.pos = pos;
            this.color = color;
        }

        int[] getPosition() {
            return pos;
        }

        String getColour() {
            return color;
        }

        @Override
        public String toString() {
            // String representation formatted as "[[x, y], red]"
            return "[" +
                    "[" +
                    pos[0] +
                    "," +
                    " " +
                    pos[1] +
                    "], " +
                    color +
                    "]";
        }
    }

    static class TriangleResult {

        int nGivenPoints;
        int nGivenColours;
        int nTriangles;
        int maxFromColour;
        List<String> colours;

        TriangleResult(final int nGivenPoints, final int nGivenColours,
                       final int nTriangles, final List<String> colours, final int maxFromColour) {
            this.nGivenPoints = nGivenPoints;
            this.nGivenColours = nGivenColours;
            this.nTriangles = nTriangles;
            this.maxFromColour = maxFromColour;
            this.colours = colours;
        }

        @Override
        public String toString() {
            // String representation formatted as "[nGivenPoints, nGivenColours, nTriangles, [red, blue], maxFromColour]"
            StringBuilder builder = new StringBuilder();
            builder.append("[")
                    .append(nGivenPoints)
                    .append(", ")
                    .append(nGivenColours)
                    .append(", ")
                    .append(nTriangles)
                    .append(", [");

            for (int i = 0; i < colours.size(); i++) {
                builder.append(colours.get(i));

                if (i != colours.size() - 1) {
                    builder.append(", ");
                }
            }

            builder.append("], ")
                    .append(maxFromColour)
                    .append("]");

            return builder.toString();
        }
    }
}