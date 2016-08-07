package kanaedev.com.realm.models;

import org.parceler.Parcel;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Parcel
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor(suppressConstructorProperties = true, access = AccessLevel.PROTECTED)
@AllArgsConstructor(suppressConstructorProperties = true, access = AccessLevel.PROTECTED)
@Data
public class Contact extends RealmObject {

    @PrimaryKey
    private int id_contact;

    private String name_contact;

    private int sdt_contact;

    private String address_contact;

    private String gender_contact;

    private String date_time_save_contact;

    private String path_image;
}
