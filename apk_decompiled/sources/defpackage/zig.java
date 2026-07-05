package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zig extends f9i {
    public static final jp0 c = new jp0(3);
    public static final jp0 d = new jp0(4);
    public static final jp0 e = new jp0(1);
    public final /* synthetic */ int a;
    public final Object b;

    public zig(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                Locale locale = Locale.US;
                arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
                if (!Locale.getDefault().equals(locale)) {
                    arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                }
                if (gf9.a()) {
                    arrayList.add(wvj.d());
                }
                break;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        Date date;
        Time time;
        Date dateB;
        switch (this.a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.b).parse(strNextString);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e2) {
                    ed5.a(sq6.x("Failed parsing '", strNextString, "' as SQL Date; at path "), jsonReader.getPreviousPath(), e2);
                    return null;
                }
            case 1:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString2 = jsonReader.nextString();
                try {
                    synchronized (this) {
                        time = new Time(((SimpleDateFormat) this.b).parse(strNextString2).getTime());
                        break;
                    }
                    return time;
                } catch (ParseException e3) {
                    ed5.a(sq6.x("Failed parsing '", strNextString2, "' as SQL Time; at path "), jsonReader.getPreviousPath(), e3);
                    return null;
                }
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString3 = jsonReader.nextString();
                synchronized (((ArrayList) this.b)) {
                    try {
                        Iterator it = ((ArrayList) this.b).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                try {
                                    dateB = pu8.b(strNextString3, new ParsePosition(0));
                                } catch (ParseException e4) {
                                    ed5.a(sq6.x("Failed parsing '", strNextString3, "' as Date; at path "), jsonReader.getPreviousPath(), e4);
                                    return null;
                                }
                                break;
                            } else {
                                try {
                                    dateB = ((DateFormat) it.next()).parse(strNextString3);
                                } catch (ParseException unused) {
                                }
                            }
                        }
                    } finally {
                    }
                }
                return dateB;
        }
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        String str2;
        String str3;
        switch (this.a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    jsonWriter.nullValue();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.b).format((Date) date);
                    break;
                }
                jsonWriter.value(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    jsonWriter.nullValue();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.b).format((Date) time);
                    break;
                }
                jsonWriter.value(str2);
                return;
            default:
                Date date2 = (Date) obj;
                if (date2 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    str3 = dateFormat.format(date2);
                    break;
                }
                jsonWriter.value(str3);
                return;
        }
    }
}
