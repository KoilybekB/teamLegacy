package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.MyCourcesItem;
import bcc.kz.legasy.schoolmiras.model.StudentHTDLItem;

import java.util.List;

public interface StudentWSService {

    List<StudentHTDLItem> getHotData(Integer studentId);

    List<MyCourcesItem> getMyCources(Integer studentId);
}
