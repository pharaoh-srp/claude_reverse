package defpackage;

import androidx.health.platform.client.proto.g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class zm0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String strDecode;
        protoReader.getClass();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        String str = "";
        String strDecode2 = str;
        String strDecode3 = strDecode2;
        String strDecode4 = null;
        Boolean boolDecode = null;
        String strDecode5 = null;
        Integer numDecode = null;
        Float fDecode = null;
        Integer numDecode2 = null;
        Float fDecode2 = null;
        String strDecode6 = null;
        String strDecode7 = null;
        String strDecode8 = null;
        String strDecode9 = null;
        Object objDecode = null;
        Boolean boolDecode2 = null;
        Boolean boolDecode3 = null;
        String strDecode10 = null;
        Boolean boolDecode4 = null;
        String strDecode11 = null;
        Object objDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new an0(str, strDecode2, strDecode3, strDecode4, boolDecode, arrayList4, strDecode5, numDecode, fDecode, numDecode2, fDecode2, strDecode6, strDecode7, strDecode8, strDecode9, (tl3) objDecode, boolDecode2, boolDecode3, strDecode10, arrayList5, arrayList6, arrayList7, arrayList8, boolDecode4, strDecode11, (y8i) objDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    strDecode = str;
                    break;
                case 3:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode3 = ProtoAdapter.STRING.decode(protoReader);
                    strDecode = str;
                    break;
                case 4:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode4 = ProtoAdapter.STRING.decode(protoReader);
                    strDecode = str;
                    break;
                case 5:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    boolDecode = ProtoAdapter.BOOL.decode(protoReader);
                    strDecode = str;
                    break;
                case 6:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    arrayList4.add(kvh.H.decode(protoReader));
                    strDecode = str;
                    break;
                case 7:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode5 = ProtoAdapter.STRING.decode(protoReader);
                    strDecode = str;
                    break;
                case 8:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    numDecode = ProtoAdapter.INT32.decode(protoReader);
                    strDecode = str;
                    break;
                case 9:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    fDecode = ProtoAdapter.FLOAT.decode(protoReader);
                    strDecode = str;
                    break;
                case 10:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    numDecode2 = ProtoAdapter.INT32.decode(protoReader);
                    strDecode = str;
                    break;
                case 11:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    fDecode2 = ProtoAdapter.FLOAT.decode(protoReader);
                    strDecode = str;
                    break;
                case 12:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode6 = ProtoAdapter.STRING.decode(protoReader);
                    strDecode = str;
                    break;
                case 13:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode7 = ProtoAdapter.STRING.decode(protoReader);
                    strDecode = str;
                    break;
                case 14:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode8 = ProtoAdapter.STRING.decode(protoReader);
                    strDecode = str;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode9 = ProtoAdapter.STRING.decode(protoReader);
                    strDecode = str;
                    break;
                case 16:
                    try {
                        objDecode = tl3.G.decode(protoReader);
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        protoReader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    strDecode = str;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    boolDecode2 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    boolDecode3 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    strDecode10 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    arrayList5.add(peb.I.decode(protoReader));
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case 21:
                    arrayList6.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    arrayList7.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    arrayList8.add(a0d.H.decode(protoReader));
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case 24:
                    boolDecode4 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case BuildConfig.VERSION_CODE /* 25 */:
                    strDecode11 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                case 26:
                    objDecode2 = y8i.G.decode(protoReader);
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    strDecode = str;
                    break;
            }
            str = strDecode;
            arrayList5 = arrayList;
            arrayList6 = arrayList2;
            arrayList7 = arrayList3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        an0 an0Var = (an0) obj;
        protoWriter.getClass();
        an0Var.getClass();
        String str = an0Var.G;
        String str2 = an0Var.F;
        String str3 = an0Var.E;
        if (!x44.r(str3, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str3);
        }
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str2);
        }
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, an0Var.H);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, an0Var.I);
        kvh.H.asRepeated().encodeWithTag(protoWriter, 6, an0Var.Z);
        protoAdapter.encodeWithTag(protoWriter, 7, an0Var.J);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 8, an0Var.K);
        ProtoAdapter<Float> protoAdapter4 = ProtoAdapter.FLOAT;
        protoAdapter4.encodeWithTag(protoWriter, 9, an0Var.L);
        protoAdapter3.encodeWithTag(protoWriter, 10, an0Var.M);
        protoAdapter4.encodeWithTag(protoWriter, 11, an0Var.N);
        protoAdapter.encodeWithTag(protoWriter, 12, an0Var.O);
        protoAdapter.encodeWithTag(protoWriter, 13, an0Var.P);
        protoAdapter.encodeWithTag(protoWriter, 14, an0Var.Q);
        protoAdapter.encodeWithTag(protoWriter, 15, an0Var.R);
        tl3.G.encodeWithTag(protoWriter, 16, an0Var.S);
        protoAdapter2.encodeWithTag(protoWriter, 17, an0Var.T);
        protoAdapter2.encodeWithTag(protoWriter, 18, an0Var.U);
        protoAdapter.encodeWithTag(protoWriter, 19, an0Var.V);
        peb.I.asRepeated().encodeWithTag(protoWriter, 20, an0Var.a0);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 21, an0Var.b0);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 22, an0Var.c0);
        a0d.H.asRepeated().encodeWithTag(protoWriter, 23, an0Var.d0);
        protoAdapter2.encodeWithTag(protoWriter, 24, an0Var.W);
        protoAdapter.encodeWithTag(protoWriter, 25, an0Var.X);
        y8i.G.encodeWithTag(protoWriter, 26, an0Var.Y);
        protoWriter.writeBytes(an0Var.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        an0 an0Var = (an0) obj;
        an0Var.getClass();
        String str = an0Var.G;
        String str2 = an0Var.F;
        int iE = an0Var.unknownFields().e();
        String str3 = an0Var.E;
        if (!x44.r(str3, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(1, str3);
        }
        if (!x44.r(str2, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(2, str2);
        }
        if (!x44.r(str, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(3, str);
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, an0Var.H) + iE;
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        int iEncodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, an0Var.J) + kvh.H.asRepeated().encodedSizeWithTag(6, an0Var.Z) + protoAdapter2.encodedSizeWithTag(5, an0Var.I) + iEncodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        int iEncodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(8, an0Var.K) + iEncodedSizeWithTag2;
        ProtoAdapter<Float> protoAdapter4 = ProtoAdapter.FLOAT;
        return y8i.G.encodedSizeWithTag(26, an0Var.Y) + protoAdapter.encodedSizeWithTag(25, an0Var.X) + protoAdapter2.encodedSizeWithTag(24, an0Var.W) + a0d.H.asRepeated().encodedSizeWithTag(23, an0Var.d0) + protoAdapter.asRepeated().encodedSizeWithTag(22, an0Var.c0) + protoAdapter.asRepeated().encodedSizeWithTag(21, an0Var.b0) + peb.I.asRepeated().encodedSizeWithTag(20, an0Var.a0) + protoAdapter.encodedSizeWithTag(19, an0Var.V) + protoAdapter2.encodedSizeWithTag(18, an0Var.U) + protoAdapter2.encodedSizeWithTag(17, an0Var.T) + tl3.G.encodedSizeWithTag(16, an0Var.S) + protoAdapter.encodedSizeWithTag(15, an0Var.R) + protoAdapter.encodedSizeWithTag(14, an0Var.Q) + protoAdapter.encodedSizeWithTag(13, an0Var.P) + protoAdapter.encodedSizeWithTag(12, an0Var.O) + protoAdapter4.encodedSizeWithTag(11, an0Var.N) + protoAdapter3.encodedSizeWithTag(10, an0Var.M) + protoAdapter4.encodedSizeWithTag(9, an0Var.L) + iEncodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        an0 an0Var = (an0) obj;
        an0Var.getClass();
        List listM1174redactElements = Internal.m1174redactElements(an0Var.Z, kvh.H);
        List listM1174redactElements2 = Internal.m1174redactElements(an0Var.a0, peb.I);
        List listM1174redactElements3 = Internal.m1174redactElements(an0Var.d0, a0d.H);
        y8i y8iVar = an0Var.Y;
        y8i y8iVar2 = y8iVar != null ? (y8i) y8i.G.redact(y8iVar) : null;
        ByteString byteString = ByteString.H;
        String str = an0Var.E;
        String str2 = an0Var.F;
        String str3 = an0Var.G;
        String str4 = an0Var.H;
        Boolean bool = an0Var.I;
        String str5 = an0Var.J;
        Integer num = an0Var.K;
        Float f = an0Var.L;
        Integer num2 = an0Var.M;
        Float f2 = an0Var.N;
        String str6 = an0Var.O;
        String str7 = an0Var.P;
        String str8 = an0Var.Q;
        String str9 = an0Var.R;
        tl3 tl3Var = an0Var.S;
        Boolean bool2 = an0Var.T;
        Boolean bool3 = an0Var.U;
        String str10 = an0Var.V;
        List list = an0Var.b0;
        List list2 = an0Var.c0;
        Boolean bool4 = an0Var.W;
        String str11 = an0Var.X;
        str.getClass();
        str2.getClass();
        str3.getClass();
        listM1174redactElements.getClass();
        listM1174redactElements2.getClass();
        list.getClass();
        list2.getClass();
        listM1174redactElements3.getClass();
        byteString.getClass();
        return new an0(str, str2, str3, str4, bool, listM1174redactElements, str5, num, f, num2, f2, str6, str7, str8, str9, tl3Var, bool2, bool3, str10, listM1174redactElements2, list, list2, listM1174redactElements3, bool4, str11, y8iVar2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        an0 an0Var = (an0) obj;
        reverseProtoWriter.getClass();
        an0Var.getClass();
        String str = an0Var.E;
        String str2 = an0Var.F;
        reverseProtoWriter.writeBytes(an0Var.unknownFields());
        y8i.G.encodeWithTag(reverseProtoWriter, 26, an0Var.Y);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, an0Var.X);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 24, an0Var.W);
        a0d.H.asRepeated().encodeWithTag(reverseProtoWriter, 23, an0Var.d0);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 22, an0Var.c0);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 21, an0Var.b0);
        peb.I.asRepeated().encodeWithTag(reverseProtoWriter, 20, an0Var.a0);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, an0Var.V);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 18, an0Var.U);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 17, an0Var.T);
        tl3.G.encodeWithTag(reverseProtoWriter, 16, an0Var.S);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, an0Var.R);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, an0Var.Q);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, an0Var.P);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, an0Var.O);
        ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 11, an0Var.N);
        ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 10, an0Var.M);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 9, an0Var.L);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 8, an0Var.K);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, an0Var.J);
        kvh.H.asRepeated().encodeWithTag(reverseProtoWriter, 6, an0Var.Z);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, an0Var.I);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, an0Var.H);
        String str3 = an0Var.G;
        if (!x44.r(str3, "")) {
            protoAdapter.encodeWithTag(reverseProtoWriter, 3, str3);
        }
        if (!x44.r(str2, "")) {
            protoAdapter.encodeWithTag(reverseProtoWriter, 2, str2);
        }
        if (x44.r(str, "")) {
            return;
        }
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, str);
    }
}
