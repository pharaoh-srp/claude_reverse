package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class m38 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = "";
        String strDecode2 = null;
        Boolean boolDecode = null;
        Object objDecode = null;
        Boolean boolDecode2 = null;
        Boolean boolDecode3 = null;
        String strDecode3 = null;
        Boolean boolDecode4 = null;
        String strDecode4 = strDecode;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new n38(strDecode4, strDecode, strDecode2, boolDecode, (tl3) objDecode, boolDecode2, boolDecode3, strDecode3, boolDecode4, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    boolDecode = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 5:
                    try {
                        objDecode = tl3.G.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = strDecode4;
                        str2 = strDecode;
                        protoReader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        strDecode4 = str;
                        strDecode = str2;
                    }
                    break;
                case 6:
                    boolDecode2 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 7:
                    boolDecode3 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 8:
                    strDecode3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    boolDecode4 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(iNextTag);
                    str = strDecode4;
                    str2 = strDecode;
                    break;
            }
            strDecode4 = str;
            strDecode = str2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        n38 n38Var = (n38) obj;
        protoWriter.getClass();
        n38Var.getClass();
        String str = n38Var.F;
        String str2 = n38Var.E;
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str2);
        }
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, n38Var.G);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 4, n38Var.H);
        tl3.G.encodeWithTag(protoWriter, 5, n38Var.I);
        protoAdapter2.encodeWithTag(protoWriter, 6, n38Var.J);
        protoAdapter2.encodeWithTag(protoWriter, 7, n38Var.K);
        protoAdapter.encodeWithTag(protoWriter, 8, n38Var.L);
        protoAdapter2.encodeWithTag(protoWriter, 9, n38Var.M);
        protoWriter.writeBytes(n38Var.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        n38 n38Var = (n38) obj;
        n38Var.getClass();
        String str = n38Var.F;
        int iE = n38Var.unknownFields().e();
        String str2 = n38Var.E;
        if (!x44.r(str2, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(1, str2);
        }
        if (!x44.r(str, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(2, str);
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, n38Var.G) + iE;
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(9, n38Var.M) + protoAdapter.encodedSizeWithTag(8, n38Var.L) + protoAdapter2.encodedSizeWithTag(7, n38Var.K) + protoAdapter2.encodedSizeWithTag(6, n38Var.J) + tl3.G.encodedSizeWithTag(5, n38Var.I) + protoAdapter2.encodedSizeWithTag(4, n38Var.H) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        n38 n38Var = (n38) obj;
        n38Var.getClass();
        ByteString byteString = ByteString.H;
        String str = n38Var.E;
        String str2 = n38Var.F;
        String str3 = n38Var.G;
        Boolean bool = n38Var.H;
        tl3 tl3Var = n38Var.I;
        Boolean bool2 = n38Var.J;
        Boolean bool3 = n38Var.K;
        String str4 = n38Var.L;
        Boolean bool4 = n38Var.M;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new n38(str, str2, str3, bool, tl3Var, bool2, bool3, str4, bool4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        n38 n38Var = (n38) obj;
        reverseProtoWriter.getClass();
        n38Var.getClass();
        String str = n38Var.E;
        reverseProtoWriter.writeBytes(n38Var.unknownFields());
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, n38Var.M);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, n38Var.L);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, n38Var.K);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, n38Var.J);
        tl3.G.encodeWithTag(reverseProtoWriter, 5, n38Var.I);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, n38Var.H);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, n38Var.G);
        String str2 = n38Var.F;
        if (!x44.r(str2, "")) {
            protoAdapter2.encodeWithTag(reverseProtoWriter, 2, str2);
        }
        if (x44.r(str, "")) {
            return;
        }
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, str);
    }
}
