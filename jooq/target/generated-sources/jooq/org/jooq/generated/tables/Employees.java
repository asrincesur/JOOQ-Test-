/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.JooqTest;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.records.EmployeesRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employees extends TableImpl<EmployeesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooq_test.employees</code>
     */
    public static final Employees EMPLOYEES = new Employees();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeesRecord> getRecordType() {
        return EmployeesRecord.class;
    }

    /**
     * The column <code>jooq_test.employees.first_name</code>.
     */
    public final TableField<EmployeesRecord, String> FİRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>jooq_test.employees.last_name</code>.
     */
    public final TableField<EmployeesRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>jooq_test.employees.email</code>.
     */
    public final TableField<EmployeesRecord, String> EMAİL = createField(DSL.name("email"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>jooq_test.employees.phone_number</code>.
     */
    public final TableField<EmployeesRecord, String> PHONE_NUMBER = createField(DSL.name("phone_number"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>jooq_test.employees.department</code>.
     */
    public final TableField<EmployeesRecord, String> DEPARTMENT = createField(DSL.name("department"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>jooq_test.employees.job_title</code>.
     */
    public final TableField<EmployeesRecord, String> JOB_TİTLE = createField(DSL.name("job_title"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>jooq_test.employees.salary</code>.
     */
    public final TableField<EmployeesRecord, String> SALARY = createField(DSL.name("salary"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>jooq_test.employees.hire_date</code>.
     */
    public final TableField<EmployeesRecord, LocalDate> HİRE_DATE = createField(DSL.name("hire_date"), SQLDataType.LOCALDATE.nullable(false), this, "");

    private Employees(Name alias, Table<EmployeesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employees(Name alias, Table<EmployeesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>jooq_test.employees</code> table reference
     */
    public Employees(String alias) {
        this(DSL.name(alias), EMPLOYEES);
    }

    /**
     * Create an aliased <code>jooq_test.employees</code> table reference
     */
    public Employees(Name alias) {
        this(alias, EMPLOYEES);
    }

    /**
     * Create a <code>jooq_test.employees</code> table reference
     */
    public Employees() {
        this(DSL.name("employees"), null);
    }

    public <O extends Record> Employees(Table<O> child, ForeignKey<O, EmployeesRecord> key) {
        super(child, key, EMPLOYEES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JooqTest.JOOQ_TEST;
    }

    @Override
    public UniqueKey<EmployeesRecord> getPrimaryKey() {
        return Keys.PK_EMP;
    }

    @Override
    public List<UniqueKey<EmployeesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNİQUE_TEL);
    }

    @Override
    public Employees as(String alias) {
        return new Employees(DSL.name(alias), this);
    }

    @Override
    public Employees as(Name alias) {
        return new Employees(alias, this);
    }

    @Override
    public Employees as(Table<?> alias) {
        return new Employees(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employees rename(String name) {
        return new Employees(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employees rename(Name name) {
        return new Employees(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employees rename(Table<?> name) {
        return new Employees(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, LocalDate> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super LocalDate, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super LocalDate, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
