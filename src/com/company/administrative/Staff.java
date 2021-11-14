package com.company.administrative;

import java.util.Objects;

/**
 * This is the Staff class. The Staff has a few basic attributes:
 * <ol>
 *    <li>Emp ID
 *    <li>name
 *    <li>Job Role
 *    <li>Gender
 * </ol>
 */

public class Staff extends Person {


    /**
     * JobRole
     */
    public enum JobRole {
        /**
         * Manager
         */
        MANAGER,
        /**
         * Waiter
         */
        WAITER
    }

    private final String name;
    private final JobRole jobRole;
    private final String gender;


    @Override
    public String toString() {
        return this.name;
    }

    /**
     * @param name       name of the staff
     * @param employeeId employeeId of the staff
     * @param role       JobRole of the staff
     * @param gender     gender of the staff
     */
    public Staff(String name, String employeeId, JobRole role, String gender) {
        this.name = name;
        this.jobRole = role;
        this.gender = gender;
    }

    /**
     * @return name of the staff
     */

    public String getName() {
        return name;
    }

    /**
     * @return gender of the staff
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return JobRole of the staff
     */
    public JobRole getJobRole() {
        return jobRole;
    }
}
