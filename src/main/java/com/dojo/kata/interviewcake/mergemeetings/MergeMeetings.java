package com.dojo.kata.interviewcake.mergemeetings;

import java.util.*;

import static java.lang.Math.max;
import static java.util.Collections.sort;
import static java.util.Comparator.comparingInt;

public class MergeMeetings {

    public static void main(String[] args) {
        List<Meeting> inputMeetings = new ArrayList<>();
        inputMeetings.add(new Meeting(1, 8));
        inputMeetings.add(new Meeting(0, 1));
        inputMeetings.add(new Meeting(0, 1));
        inputMeetings.add(new Meeting(4, 7));
        for (Meeting meeting : mergeMeetings(inputMeetings)) {
            System.out.println(meeting);
        }
    }

    private static List<Meeting> mergeMeetings(List<Meeting> inputMeetings) {
        List<Meeting> sortedMeetings = sortMeetingsByAscendingStartTime(inputMeetings);
        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(sortedMeetings.get(0));
        for (Meeting currentMeeting : sortedMeetings) {
            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);
            if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
                lastMergedMeeting.setEndTime(max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }
        return mergedMeetings;
    }

    private static List<Meeting> sortMeetingsByAscendingStartTime(List<Meeting> meetings) {
        sort(meetings, comparingInt(Meeting::getStartTime));
        return meetings;
    }


}
