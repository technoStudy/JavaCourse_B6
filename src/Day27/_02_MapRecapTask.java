package Day27;

import java.util.*;

public class _02_MapRecapTask {

    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]

    // PART 2
    // find how many members each group has

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> groupsAndMembers = new HashMap<>();

            ArrayList<String> devTeam = new ArrayList<>();
            Collections.addAll(devTeam, "Josef", "Ugur", "Nigar", "Faruk");

            ArrayList<String> qaTeam = new ArrayList<>();
            Collections.addAll(qaTeam, "Mario", "Lala", "Abdullah", "Funda");

        groupsAndMembers.put("Development Team", devTeam);
        groupsAndMembers.put("QA Team", qaTeam);

        System.out.println(groupsAndMembers);



        // ****************** PART 2 ******************

        // Collections: is a parent class of all collection types(arraylist, set...)
        // Collection: is a data type like List

        // Solution 1
        Collection<ArrayList<String>> values = groupsAndMembers.values();
        for (ArrayList<String> list : values){
            System.out.println(list.size());
        }


        // Solution 2
        Set<String> keys = groupsAndMembers.keySet();
        for (String key : keys) {
            ArrayList<String> group = groupsAndMembers.get(key);
            System.out.println("Number of members in: " + key + " " + group.size());
        }

    }

}
