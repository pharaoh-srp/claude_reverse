package defpackage;

import androidx.health.platform.client.proto.g;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.sentry.b2;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class eac extends f9i {
    public static final cac b = new cac(new eac(0), 0);
    public final /* synthetic */ int a;

    public /* synthetic */ eac(int i) {
        this.a = i;
    }

    public static bh9 c(JsonReader jsonReader, JsonToken jsonToken) {
        int i = j9i.a[jsonToken.ordinal()];
        if (i == 1) {
            return new vh9(new jw9(jsonReader.nextString()));
        }
        if (i == 2) {
            return new vh9(jsonReader.nextString());
        }
        if (i == 3) {
            return new vh9(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i == 6) {
            jsonReader.nextNull();
            return oh9.E;
        }
        xh6.m("Unexpected token: ", jsonToken);
        return null;
    }

    public static bh9 d(JsonReader jsonReader, JsonToken jsonToken) {
        int i = j9i.a[jsonToken.ordinal()];
        if (i == 4) {
            jsonReader.beginArray();
            return new ig9();
        }
        if (i != 5) {
            return null;
        }
        jsonReader.beginObject();
        return new qh9();
    }

    public static void e(JsonWriter jsonWriter, bh9 bh9Var) throws IOException {
        if (bh9Var == null || (bh9Var instanceof oh9)) {
            jsonWriter.nullValue();
            return;
        }
        if (bh9Var instanceof vh9) {
            vh9 vh9VarH = bh9Var.h();
            Serializable serializable = vh9VarH.E;
            if (serializable instanceof Number) {
                jsonWriter.value(vh9VarH.l());
                return;
            } else if (serializable instanceof Boolean) {
                jsonWriter.value(vh9VarH.a());
                return;
            } else {
                jsonWriter.value(vh9VarH.m());
                return;
            }
        }
        if (bh9Var instanceof ig9) {
            jsonWriter.beginArray();
            Iterator it = bh9Var.e().E.iterator();
            while (it.hasNext()) {
                e(jsonWriter, (bh9) it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (!(bh9Var instanceof qh9)) {
            b2.g("Couldn't write ", bh9Var.getClass());
            return;
        }
        jsonWriter.beginObject();
        Iterator it2 = ((m7a) bh9Var.g().E.entrySet()).iterator();
        while (((o7a) it2).hasNext()) {
            p7a p7aVarA = ((l7a) it2).a();
            jsonWriter.name((String) p7aVarA.getKey());
            e(jsonWriter, (bh9) p7aVarA.getValue());
        }
        jsonWriter.endObject();
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        boolean zNextBoolean;
        switch (this.a) {
            case 0:
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i = dac.a[jsonTokenPeek.ordinal()];
                if (i == 1) {
                    jsonReader.nextNull();
                    return null;
                }
                if (i == 2 || i == 3) {
                    return new jw9(jsonReader.nextString());
                }
                StringBuilder sb = new StringBuilder("Expecting number, got: ");
                sb.append(jsonTokenPeek);
                String path = jsonReader.getPath();
                sb.append("; at path ");
                sb.append(path);
                throw new JsonSyntaxException(sb.toString());
            case 1:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 2:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            case 5:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 6:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 7:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.length() == 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                StringBuilder sbX = sq6.x("Expecting character, got: ", strNextString, "; at ");
                sbX.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbX.toString());
            case 8:
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                if (jsonTokenPeek2 != JsonToken.NULL) {
                    return jsonTokenPeek2 == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            case 9:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString2 = jsonReader.nextString();
                try {
                    return new BigDecimal(strNextString2);
                } catch (NumberFormatException e3) {
                    ed5.a(sq6.x("Failed parsing '", strNextString2, "' as BigDecimal; at path "), jsonReader.getPreviousPath(), e3);
                    return null;
                }
            case 10:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString3 = jsonReader.nextString();
                try {
                    return new BigInteger(strNextString3);
                } catch (NumberFormatException e4) {
                    ed5.a(sq6.x("Failed parsing '", strNextString3, "' as BigInteger; at path "), jsonReader.getPreviousPath(), e4);
                    return null;
                }
            case 11:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new jw9(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 12:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString4 = jsonReader.nextString();
                if ("null".equals(strNextString4)) {
                    return null;
                }
                return new URL(strNextString4);
            case 16:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String strNextString5 = jsonReader.nextString();
                    if ("null".equals(strNextString5)) {
                        return null;
                    }
                    return new URI(strNextString5);
                } catch (URISyntaxException e5) {
                    throw new JsonIOException(e5);
                }
            case g.MAX_FIELD_NUMBER /* 17 */:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case g.AVG_FIELD_NUMBER /* 18 */:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString6 = jsonReader.nextString();
                try {
                    return UUID.fromString(strNextString6);
                } catch (IllegalArgumentException e6) {
                    ed5.a(sq6.x("Failed parsing '", strNextString6, "' as UUID; at path "), jsonReader.getPreviousPath(), e6);
                    return null;
                }
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String strNextString7 = jsonReader.nextString();
                try {
                    return Currency.getInstance(strNextString7);
                } catch (IllegalArgumentException e7) {
                    ed5.a(sq6.x("Failed parsing '", strNextString7, "' as Currency; at path "), jsonReader.getPreviousPath(), e7);
                    return null;
                }
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    int iNextInt = jsonReader.nextInt();
                    if ("year".equals(strNextName)) {
                        i3 = iNextInt;
                    } else if ("month".equals(strNextName)) {
                        i4 = iNextInt;
                    } else if ("dayOfMonth".equals(strNextName)) {
                        i5 = iNextInt;
                    } else if ("hourOfDay".equals(strNextName)) {
                        i6 = iNextInt;
                    } else if ("minute".equals(strNextName)) {
                        i7 = iNextInt;
                    } else if ("second".equals(strNextName)) {
                        i8 = iNextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i3, i4, i5, i6, i7, i8);
            case 21:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                JsonToken jsonTokenPeek3 = jsonReader.peek();
                bh9 bh9VarD = d(jsonReader, jsonTokenPeek3);
                if (bh9VarD == null) {
                    return c(jsonReader, jsonTokenPeek3);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.hasNext()) {
                        String strNextName2 = bh9VarD instanceof qh9 ? jsonReader.nextName() : null;
                        JsonToken jsonTokenPeek4 = jsonReader.peek();
                        bh9 bh9VarD2 = d(jsonReader, jsonTokenPeek4);
                        boolean z = bh9VarD2 != null;
                        if (bh9VarD2 == null) {
                            bh9VarD2 = c(jsonReader, jsonTokenPeek4);
                        }
                        if (bh9VarD instanceof ig9) {
                            ((ig9) bh9VarD).o(bh9VarD2);
                        } else {
                            ((qh9) bh9VarD).o(strNextName2, bh9VarD2);
                        }
                        if (z) {
                            arrayDeque.addLast(bh9VarD);
                            bh9VarD = bh9VarD2;
                        }
                    } else {
                        if (bh9VarD instanceof ig9) {
                            jsonReader.endArray();
                        } else {
                            jsonReader.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return bh9VarD;
                        }
                        bh9VarD = (bh9) arrayDeque.removeLast();
                    }
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken jsonTokenPeek5 = jsonReader.peek();
                int i9 = 0;
                while (jsonTokenPeek5 != JsonToken.END_ARRAY) {
                    int i10 = j9i.a[jsonTokenPeek5.ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        int iNextInt2 = jsonReader.nextInt();
                        if (iNextInt2 == 0) {
                            zNextBoolean = false;
                        } else {
                            if (iNextInt2 != 1) {
                                StringBuilder sbU = vb7.u("Invalid bitset value ", iNextInt2, ", expected 0 or 1; at path ");
                                sbU.append(jsonReader.getPreviousPath());
                                throw new JsonSyntaxException(sbU.toString());
                            }
                            zNextBoolean = true;
                        }
                    } else {
                        if (i10 != 3) {
                            StringBuilder sb2 = new StringBuilder("Invalid bitset value type: ");
                            sb2.append(jsonTokenPeek5);
                            String path2 = jsonReader.getPath();
                            sb2.append("; at path ");
                            sb2.append(path2);
                            throw new JsonSyntaxException(sb2.toString());
                        }
                        zNextBoolean = jsonReader.nextBoolean();
                    }
                    if (zNextBoolean) {
                        bitSet.set(i9);
                    }
                    i9++;
                    jsonTokenPeek5 = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            case 24:
                JsonToken jsonTokenPeek6 = jsonReader.peek();
                if (jsonTokenPeek6 != JsonToken.NULL) {
                    return jsonTokenPeek6 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            case BuildConfig.VERSION_CODE /* 25 */:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 26:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt3 = jsonReader.nextInt();
                    if (iNextInt3 <= 255 && iNextInt3 >= -128) {
                        return Byte.valueOf((byte) iNextInt3);
                    }
                    StringBuilder sbU2 = vb7.u("Lossy conversion from ", iNextInt3, " to byte; at path ");
                    sbU2.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbU2.toString());
                } catch (NumberFormatException e8) {
                    throw new JsonSyntaxException(e8);
                }
            case 27:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 <= 65535 && iNextInt4 >= -32768) {
                        return Short.valueOf((short) iNextInt4);
                    }
                    StringBuilder sbU3 = vb7.u("Lossy conversion from ", iNextInt4, " to short; at path ");
                    sbU3.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbU3.toString());
                } catch (NumberFormatException e9) {
                    throw new JsonSyntaxException(e9);
                }
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
        }
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        int i = 0;
        switch (this.a) {
            case 0:
                jsonWriter.value((Number) obj);
                return;
            case 1:
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                xd8.a(dDoubleValue);
                jsonWriter.value(dDoubleValue);
                return;
            case 2:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    jsonWriter.nullValue();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                xd8.a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                jsonWriter.value(numberValueOf);
                return;
            case 3:
                jsonWriter.beginArray();
                int length = ((AtomicIntegerArray) obj).length();
                while (i < length) {
                    jsonWriter.value(r5.get(i));
                    i++;
                }
                jsonWriter.endArray();
                return;
            case 4:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(number2.longValue());
                    return;
                }
            case 5:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                jsonWriter.value(numberValueOf2);
                return;
            case 6:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(number3.doubleValue());
                    return;
                }
            case 7:
                Character ch = (Character) obj;
                jsonWriter.value(ch != null ? String.valueOf(ch) : null);
                return;
            case 8:
                jsonWriter.value((String) obj);
                return;
            case 9:
                jsonWriter.value((BigDecimal) obj);
                return;
            case 10:
                jsonWriter.value((BigInteger) obj);
                return;
            case 11:
                jsonWriter.value((jw9) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                jsonWriter.value(sb != null ? sb.toString() : null);
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                jsonWriter.value(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                URL url = (URL) obj;
                jsonWriter.value(url != null ? url.toExternalForm() : null);
                return;
            case 16:
                URI uri = (URI) obj;
                jsonWriter.value(uri != null ? uri.toASCIIString() : null);
                return;
            case g.MAX_FIELD_NUMBER /* 17 */:
                InetAddress inetAddress = (InetAddress) obj;
                jsonWriter.value(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case g.AVG_FIELD_NUMBER /* 18 */:
                UUID uuid = (UUID) obj;
                jsonWriter.value(uuid != null ? uuid.toString() : null);
                return;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                jsonWriter.value(((Currency) obj).getCurrencyCode());
                return;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                if (((Calendar) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(r5.get(1));
                jsonWriter.name("month");
                jsonWriter.value(r5.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(r5.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(r5.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(r5.get(12));
                jsonWriter.name("second");
                jsonWriter.value(r5.get(13));
                jsonWriter.endObject();
                return;
            case 21:
                Locale locale = (Locale) obj;
                jsonWriter.value(locale != null ? locale.toString() : null);
                return;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                e(jsonWriter, (bh9) obj);
                return;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                BitSet bitSet = (BitSet) obj;
                jsonWriter.beginArray();
                int length2 = bitSet.length();
                while (i < length2) {
                    jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                    i++;
                }
                jsonWriter.endArray();
                return;
            case 24:
                jsonWriter.value((Boolean) obj);
                return;
            case BuildConfig.VERSION_CODE /* 25 */:
                Boolean bool = (Boolean) obj;
                jsonWriter.value(bool == null ? "null" : bool.toString());
                return;
            case 26:
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(r5.byteValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(r5.shortValue());
                    return;
                }
            default:
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(r5.intValue());
                    return;
                }
        }
    }
}
