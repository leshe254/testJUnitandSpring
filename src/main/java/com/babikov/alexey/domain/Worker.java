package com.babikov.alexey.domain;

import com.babikov.alexey.dto.WorkerHandler;

public class Worker implements WorkerHandler {
    private int worker_id;
    private String name;
    private Department dep;
    private int salary;
    private int role;

    public Worker(int worker_id, String name, Department dep, int salary, int role) {
        this.worker_id = worker_id;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
        this.role = role;
    }

    public Worker() {
    }

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public void changeName(String newName) {
        this.name = newName;
    }

    @Override
    public void changeDep(Department newDep) {
        this.dep = newDep;
    }

    @Override
    public void changeSalary(int newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "worker_id=" + worker_id +
                ", name='" + name + '\'' +
                ", dep=" + dep.getName() +
                ", salary=" + salary +
                ", role=" + role +
                '}';
    }
}
