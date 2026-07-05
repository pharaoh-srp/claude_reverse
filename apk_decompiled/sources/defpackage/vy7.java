package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class vy7 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = "";
        Map<String, ?> mapDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        String strDecode4 = null;
        String strDecode5 = null;
        Boolean boolDecode = null;
        Boolean boolDecode2 = null;
        String strDecode6 = null;
        Boolean boolDecode3 = null;
        String strDecode7 = "";
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new wy7(strDecode, strDecode7, mapDecode, strDecode2, strDecode3, strDecode4, strDecode5, boolDecode, boolDecode2, strDecode6, boolDecode3, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    strDecode7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    mapDecode = ProtoAdapter.STRUCT_MAP.decode(protoReader);
                    break;
                case 4:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    strDecode3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    strDecode4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    strDecode5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    boolDecode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    boolDecode2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    strDecode6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    boolDecode3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        wy7 wy7Var = (wy7) obj;
        protoWriter.getClass();
        wy7Var.getClass();
        String str = wy7Var.F;
        String str2 = wy7Var.E;
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str2);
        }
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
        }
        Map<String, ?> map = wy7Var.O;
        if (map != null) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 3, map);
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, wy7Var.G);
        protoAdapter.encodeWithTag(protoWriter, 5, wy7Var.H);
        protoAdapter.encodeWithTag(protoWriter, 6, wy7Var.I);
        protoAdapter.encodeWithTag(protoWriter, 7, wy7Var.J);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 8, wy7Var.K);
        protoAdapter2.encodeWithTag(protoWriter, 9, wy7Var.L);
        protoAdapter.encodeWithTag(protoWriter, 10, wy7Var.M);
        protoAdapter2.encodeWithTag(protoWriter, 11, wy7Var.N);
        protoWriter.writeBytes(wy7Var.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        wy7 wy7Var = (wy7) obj;
        wy7Var.getClass();
        String str = wy7Var.F;
        int iE = wy7Var.unknownFields().e();
        String str2 = wy7Var.E;
        if (!x44.r(str2, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(1, str2);
        }
        if (!x44.r(str, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(2, str);
        }
        Map<String, ?> map = wy7Var.O;
        if (map != null) {
            iE += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(3, map);
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(7, wy7Var.J) + protoAdapter.encodedSizeWithTag(6, wy7Var.I) + protoAdapter.encodedSizeWithTag(5, wy7Var.H) + protoAdapter.encodedSizeWithTag(4, wy7Var.G) + iE;
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(11, wy7Var.N) + protoAdapter.encodedSizeWithTag(10, wy7Var.M) + protoAdapter2.encodedSizeWithTag(9, wy7Var.L) + protoAdapter2.encodedSizeWithTag(8, wy7Var.K) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        wy7 wy7Var = (wy7) obj;
        wy7Var.getClass();
        Map<String, ?> map = wy7Var.O;
        Map<String, ?> mapRedact = map != null ? ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ByteString byteString = ByteString.H;
        String str = wy7Var.E;
        String str2 = wy7Var.F;
        String str3 = wy7Var.G;
        String str4 = wy7Var.H;
        String str5 = wy7Var.I;
        String str6 = wy7Var.J;
        Boolean bool = wy7Var.K;
        Boolean bool2 = wy7Var.L;
        String str7 = wy7Var.M;
        Boolean bool3 = wy7Var.N;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new wy7(str, str2, mapRedact, str3, str4, str5, str6, bool, bool2, str7, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        wy7 wy7Var = (wy7) obj;
        reverseProtoWriter.getClass();
        wy7Var.getClass();
        String str = wy7Var.E;
        String str2 = wy7Var.F;
        reverseProtoWriter.writeBytes(wy7Var.unknownFields());
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, wy7Var.N);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, wy7Var.M);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, wy7Var.L);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, wy7Var.K);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, wy7Var.J);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, wy7Var.I);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, wy7Var.H);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, wy7Var.G);
        Map<String, ?> map = wy7Var.O;
        if (map != null) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 3, map);
        }
        if (!x44.r(str2, "")) {
            protoAdapter2.encodeWithTag(reverseProtoWriter, 2, str2);
        }
        if (x44.r(str, "")) {
            return;
        }
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, str);
    }
}
