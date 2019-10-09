package ru.javawebinar.basejava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;
import java.time.YearMonth;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class Organization implements Serializable {
    private String link;
    private String position;
    private YearMonth dateOfStart;
    private YearMonth dateOfFinish;
    private String info;

    public Organization() {
    }

    public Organization(String link, String position, YearMonth dateOfStart, YearMonth dateOfFinish, String info) {
        this.link = link;
        this.position = position;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
        this.info = info;
    }

    public Organization(String position, YearMonth dateOfStart, YearMonth dateOfFinish, String info) {
        this.position = position;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return link.equals(that.link) &&
                position.equals(that.position) &&
                dateOfStart.equals(that.dateOfStart) &&
                dateOfFinish.equals(that.dateOfFinish) &&
                info.equals(that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, position, dateOfStart, dateOfFinish, info);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "link='" + link + '\'' +
                ", title='" + position + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", dateOfFinish=" + dateOfFinish +
                ", info='" + info + '\'' +
                '}';
    }
}
