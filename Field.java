package com.app.dto;

import java.util.ArrayList;
import java.util.List;

public class Field {
	
	private String id;
	private String label;
	private String hide_label;
	private String description;
	private String name;
	private String type;
	private List<Option> options=new ArrayList<>();
	private String required;
	private String uniq;
	private String hidden;
	private String readonly;
	private String colspan;
	private String sort;
	private Logic logic;
	private String calculation;
	private String default_;
	private String section_text;
	private String text_editor;
	private String section_break;
	private String section_heading;
	private String label_position;
	private String num_columns;
	private int field_one_calculation;
	private int field_two_calculation;
	private String calculation_units;
	private String calculation_operator;
	private String calculation_type;
	private int calculation_allow_negatives;
	private int text_size;
	private String min_value;
	private String max_value;
	private String currency;
	private String decimals;
	private String slider;
	private String placeholder;
	private String date_format;
	private String max_date;
	private String time_format;
	private int year_minus;
	private int year_plus;
	private int maxlength;
	private int confirm;
	private String option_layout;
	private int option_other;
	private int randomize_options;
	private String option_store;
	private int option_show_values;
	private String file_types;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getHide_label() {
		return hide_label;
	}
	public void setHide_label(String hide_label) {
		this.hide_label = hide_label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public String getRequired() {
		return required;
	}
	public void setRequired(String required) {
		this.required = required;
	}
	public String getUniq() {
		return uniq;
	}
	public void setUniq(String uniq) {
		this.uniq = uniq;
	}
	public String getHidden() {
		return hidden;
	}
	public void setHidden(String hidden) {
		this.hidden = hidden;
	}
	public String getReadonly() {
		return readonly;
	}
	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}
	public String getColspan() {
		return colspan;
	}
	public void setColspan(String colspan) {
		this.colspan = colspan;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public Logic getLogic() {
		return logic;
	}
	public void setLogic(Logic logic) {
		this.logic = logic;
	}
	public String getCalculation() {
		return calculation;
	}
	public void setCalculation(String calculation) {
		this.calculation = calculation;
	}
	public String getDefault_() {
		return default_;
	}
	public void setDefault_(String default_) {
		this.default_ = default_;
	}
	public String getSection_text() {
		return section_text;
	}
	public void setSection_text(String section_text) {
		this.section_text = section_text;
	}
	public String getText_editor() {
		return text_editor;
	}
	public void setText_editor(String text_editor) {
		this.text_editor = text_editor;
	}
	public String getSection_break() {
		return section_break;
	}
	public void setSection_break(String section_break) {
		this.section_break = section_break;
	}
	public String getSection_heading() {
		return section_heading;
	}
	public void setSection_heading(String section_heading) {
		this.section_heading = section_heading;
	}
	public String getLabel_position() {
		return label_position;
	}
	public void setLabel_position(String label_position) {
		this.label_position = label_position;
	}
	public String getNum_columns() {
		return num_columns;
	}
	public void setNum_columns(String num_columns) {
		this.num_columns = num_columns;
	}
	public int getField_one_calculation() {
		return field_one_calculation;
	}
	public void setField_one_calculation(int field_one_calculation) {
		this.field_one_calculation = field_one_calculation;
	}
	public int getField_two_calculation() {
		return field_two_calculation;
	}
	public void setField_two_calculation(int field_two_calculation) {
		this.field_two_calculation = field_two_calculation;
	}
	public String getCalculation_units() {
		return calculation_units;
	}
	public void setCalculation_units(String calculation_units) {
		this.calculation_units = calculation_units;
	}
	public String getCalculation_operator() {
		return calculation_operator;
	}
	public void setCalculation_operator(String calculation_operator) {
		this.calculation_operator = calculation_operator;
	}
	public String getCalculation_type() {
		return calculation_type;
	}
	public void setCalculation_type(String calculation_type) {
		this.calculation_type = calculation_type;
	}
	public int getCalculation_allow_negatives() {
		return calculation_allow_negatives;
	}
	public void setCalculation_allow_negatives(int calculation_allow_negatives) {
		this.calculation_allow_negatives = calculation_allow_negatives;
	}
	public int getText_size() {
		return text_size;
	}
	public void setText_size(int text_size) {
		this.text_size = text_size;
	}
	public String getMin_value() {
		return min_value;
	}
	public void setMin_value(String min_value) {
		this.min_value = min_value;
	}
	public String getMax_value() {
		return max_value;
	}
	public void setMax_value(String max_value) {
		this.max_value = max_value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDecimals() {
		return decimals;
	}
	public void setDecimals(String decimals) {
		this.decimals = decimals;
	}
	public String getSlider() {
		return slider;
	}
	public void setSlider(String slider) {
		this.slider = slider;
	}
	public String getPlaceholder() {
		return placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	public String getDate_format() {
		return date_format;
	}
	public void setDate_format(String date_format) {
		this.date_format = date_format;
	}
	public String getMax_date() {
		return max_date;
	}
	public void setMax_date(String max_date) {
		this.max_date = max_date;
	}
	public String getTime_format() {
		return time_format;
	}
	public void setTime_format(String time_format) {
		this.time_format = time_format;
	}
	public int getYear_minus() {
		return year_minus;
	}
	public void setYear_minus(int year_minus) {
		this.year_minus = year_minus;
	}
	public int getYear_plus() {
		return year_plus;
	}
	public void setYear_plus(int year_plus) {
		this.year_plus = year_plus;
	}
	public int getMaxlength() {
		return maxlength;
	}
	public void setMaxlength(int maxlength) {
		this.maxlength = maxlength;
	}
	public int getConfirm() {
		return confirm;
	}
	public void setConfirm(int confirm) {
		this.confirm = confirm;
	}
	public String getOption_layout() {
		return option_layout;
	}
	public void setOption_layout(String option_layout) {
		this.option_layout = option_layout;
	}
	public int getOption_other() {
		return option_other;
	}
	public void setOption_other(int option_other) {
		this.option_other = option_other;
	}
	public int getRandomize_options() {
		return randomize_options;
	}
	public void setRandomize_options(int randomize_options) {
		this.randomize_options = randomize_options;
	}
	public String getOption_store() {
		return option_store;
	}
	public void setOption_store(String option_store) {
		this.option_store = option_store;
	}
	public int getOption_show_values() {
		return option_show_values;
	}
	public void setOption_show_values(int option_show_values) {
		this.option_show_values = option_show_values;
	}
	public String getFile_types() {
		return file_types;
	}
	public void setFile_types(String file_types) {
		this.file_types = file_types;
	}
	
	
	
	
	
	

}
