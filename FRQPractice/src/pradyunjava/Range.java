package pradyunjava;

import java.util.ArrayList;
import java.util.List;

interface NumberGroup{
    boolean contains(int num);
}


public class Range implements NumberGroup{
    private int minimum;
    private int maximum;
    private List<Integer> group;

    public Range(int min, int max){
        maximum = min;
        maximum = max;
        group = new ArrayList<>();
        for(int i = minimum; i <= maximum; i++){
            group.add(i);
        }
    }
    @Override
    public boolean contains(int num) {
        return (group.indexOf(num) != -1);
    }
}

class MultipleGroups implements NumberGroup{
    private List<NumberGroup> groupList;

    public boolean contains(int num){
        for(NumberGroup group: groupList){
            if(group.contains(num))
                return true;
        }
        return false;
    }
}
