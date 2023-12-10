package com.babikov.alexey.dto;

import com.babikov.alexey.domain.Department;

public interface WorkerHandler {
    void changeName(String newName);
    void changeDep(Department newDep);
    void changeSalary(int newSalary);
}
