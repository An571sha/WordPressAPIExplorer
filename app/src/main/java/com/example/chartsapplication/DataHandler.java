package com.example.chartsapplication;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DataHandler {

    public ChartsData oneYearData;

    public ChartsData twoMonthsData;

    public ChartsData fourWeeksData;

    public ChartsData sevenDaysData;

    private final String jSONForOneYear = "{\"entries_per_day_of_week\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[3,2,1,4,4,1,2],\"title\":\"Entry Count per Day\"},\"average_day_of_week_mood\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[0,3,0,3.75,0,0,3],\"title\":\"Average Mood per Day\",\"display_y_border\":false,\"display_x_gridlines\":false,\"y_min_tick\":0,\"y_max_tick\":5.5,\"y_tick_step\":0.5,\"y_tick_font_size\":25,\"tooltip_body_font_size\":15,\"display_tooltip_color_box\":false},\"daily_words\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[7,166,0,187,27,3,19],\"title\":\"Word Count per Day\"},\"entries_count\":{\"labels\":[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,2,4,5,2,0,2],\"title\":\"Entry Count\"},\"average_mood_during_last_x_days\":{\"labels\":[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3.5,3,0,3],\"title\":\"Average Mood\",\"display_y_border\":false,\"display_x_gridlines\":false,\"y_min_tick\":0,\"y_max_tick\":5.5,\"y_tick_step\":0.5,\"y_tick_font_size\":25,\"tooltip_body_font_size\":15,\"display_tooltip_color_box\":false},\"words_count_during_last_x_days\":{\"labels\":[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,12,0,0,0,0,19,193,170,2,0,7],\"title\":\"Word Count\"},\"mood_count\":{\"labels\":[5,4,3,2,1],\"data\":[1,2,2,1,0],\"title\":\"Mood Count\",\"display_legend\":true,\"disable_scales\":true,\"tooltip_body_font_size\":15,\"legend_font_size\":15}}";

    private final String jSONForFourWeeks = "{\"entries_per_day_of_week\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[1,2,1,4,2,1,1],\"title\":\"Entry Count per Day\"},\"average_day_of_week_mood\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[0,3,0,3.75,0,0,3],\"title\":\"Average Mood per Day\",\"display_y_border\":false,\"display_x_gridlines\":false,\"y_min_tick\":0,\"y_max_tick\":5.5,\"y_tick_step\":0.5,\"y_tick_font_size\":25,\"tooltip_body_font_size\":15,\"display_tooltip_color_box\":false},\"daily_words\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[0,166,0,187,2,3,7],\"title\":\"Word Count per Day\"},\"entries_count\":{\"labels\":[28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,1,1,1,1,0,0,2,0,1,1,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,1,1,0],\"title\":\"Entry Count\"},\"average_mood_during_last_x_days\":{\"labels\":[28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,0,5,0,0,0,0,3,0,4,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,3,0,0],\"title\":\"Average Mood\",\"display_y_border\":false,\"display_x_gridlines\":false,\"y_min_tick\":0,\"y_max_tick\":5.5,\"y_tick_step\":0.5,\"y_tick_font_size\":25,\"tooltip_body_font_size\":15,\"display_tooltip_color_box\":false},\"words_count_during_last_x_days\":{\"labels\":[28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,0,184,2,3,0,0,166,0,1,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,7,0,0],\"title\":\"Word Count\"},\"mood_count\":{\"labels\":[5,4,3,2,1],\"data\":[1,2,2,1,0],\"title\":\"Mood Count\",\"display_legend\":true,\"disable_scales\":true,\"tooltip_body_font_size\":15,\"legend_font_size\":15}}";

    private final String jSONForTwoMonths = "{\"entries_per_day_of_week\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[3,2,1,4,3,1,1],\"title\":\"Entry Count per Day\"},\"average_day_of_week_mood\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[0,3,0,3.75,0,0,3],\"title\":\"Average Mood per Day\",\"display_y_border\":false,\"display_x_gridlines\":false,\"y_min_tick\":0,\"y_max_tick\":5.5,\"y_tick_step\":0.5,\"y_tick_font_size\":25,\"tooltip_body_font_size\":15,\"display_tooltip_color_box\":false},\"daily_words\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[7,166,0,187,21,3,7],\"title\":\"Word Count per Day\"},\"entries_count\":{\"labels\":[60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,1,1,1,1,0,0,2,0,1,1,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,1,1,0],\"title\":\"Entry Count\"},\"average_mood_during_last_x_days\":{\"labels\":[60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,0,0,0,3,0,4,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,3,0,0],\"title\":\"Average Mood\",\"display_y_border\":false,\"display_x_gridlines\":false,\"y_min_tick\":0,\"y_max_tick\":5.5,\"y_tick_step\":0.5,\"y_tick_font_size\":25,\"tooltip_body_font_size\":15,\"display_tooltip_color_box\":false},\"words_count_during_last_x_days\":{\"labels\":[60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,19,0,0,7,0,0,184,2,3,0,0,166,0,1,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,7,0,0],\"title\":\"Word Count\"},\"mood_count\":{\"labels\":[5,4,3,2,1],\"data\":[1,2,2,1,0],\"title\":\"Mood Count\",\"display_legend\":true,\"disable_scales\":true,\"tooltip_body_font_size\":15,\"legend_font_size\":15}}";

    private final String jSONForSevenDays = "{\"entries_per_day_of_week\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[1,0,0,0,0,0,5],\"title\":\"Entry Count per Day\"},\"average_day_of_week_mood\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[0,0,0,0,0,0,3.8],\"title\":\"Average Mood per Day\",\"display_y_border\":false,\"display_x_gridlines\":false,\"y_min_tick\":0,\"y_max_tick\":5.5,\"y_tick_step\":0.5,\"y_tick_font_size\":25,\"tooltip_body_font_size\":15,\"display_tooltip_color_box\":false},\"daily_words\":{\"labels\":[\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\",\"Sunday\"],\"data\":[0,0,0,0,0,0,9],\"title\":\"Word Count per Day\"},\"entries_count\":{\"labels\":[7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,5,1,0,0],\"title\":\"Entry Count\"},\"average_mood_during_last_x_days\":{\"labels\":[7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,3.8,0,0,0],\"title\":\"Average Mood\",\"display_y_border\":false,\"display_x_gridlines\":false,\"y_min_tick\":0,\"y_max_tick\":5.5,\"y_tick_step\":0.5,\"y_tick_font_size\":25,\"tooltip_body_font_size\":15,\"display_tooltip_color_box\":false},\"words_count_during_last_x_days\":{\"labels\":[7,6,5,4,3,2,1,0],\"data\":[0,0,0,0,9,0,0,0],\"title\":\"Word Count\"},\"mood_count\":{\"labels\":[5,4,3,2,1],\"data\":[2,1,1,1,0],\"title\":\"Mood Count\",\"display_legend\":true,\"disable_scales\":true,\"tooltip_body_font_size\":15,\"legend_font_size\":15}}";


    public DataHandler() {

        oneYearData = new ChartsData("one_year_data", jSONForOneYear);
        fourWeeksData = new ChartsData("four_weeks_data", jSONForFourWeeks);
        twoMonthsData = new ChartsData("two_months_data", jSONForTwoMonths);
        sevenDaysData = new ChartsData("seven_days_moths", jSONForSevenDays);
    }


    public static List<Entry> getEntryListFromJson(JSONObject jsonObject) throws JSONException {
        JSONArray value = (JSONArray) jsonObject.get("data");
        List<Entry> list = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            list.add(new Entry(i, (float) value.getDouble(i)));
        }
        return list;
    }


    public static List<BarEntry> getBarEntryListFromJson(JSONObject jsonObject) throws JSONException {
        JSONArray value = (JSONArray) jsonObject.get("data");
        List<BarEntry> list = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            list.add(new BarEntry(i, (float) value.getDouble(i)));
        }
        return list;
    }

    public static List<Float> getFloatListFromJson(JSONObject jsonObject) throws JSONException {
        JSONArray labels = (JSONArray) jsonObject.get("labels");
        List<Float> list = new ArrayList<>();
        for (int i = 0; i < labels.length(); i++) {
            list.add((float) labels.getDouble(i));
        }
        return list;

    }


}