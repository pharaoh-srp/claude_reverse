package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class oi3 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = "";
        Map<String, ?> mapDecode = null;
        String strDecode2 = null;
        String strDecode3 = "";
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new pi3(strDecode, strDecode3, mapDecode, strDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 3) {
                mapDecode = ProtoAdapter.STRUCT_MAP.decode(protoReader);
            } else if (iNextTag != 4) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        pi3 pi3Var = (pi3) obj;
        protoWriter.getClass();
        pi3Var.getClass();
        String str = pi3Var.F;
        String str2 = pi3Var.E;
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str2);
        }
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
        }
        Map<String, ?> map = pi3Var.H;
        if (map != null) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 3, map);
        }
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pi3Var.G);
        protoWriter.writeBytes(pi3Var.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        pi3 pi3Var = (pi3) obj;
        pi3Var.getClass();
        String str = pi3Var.F;
        int iE = pi3Var.unknownFields().e();
        String str2 = pi3Var.E;
        if (!x44.r(str2, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(1, str2);
        }
        if (!x44.r(str, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(2, str);
        }
        Map<String, ?> map = pi3Var.H;
        if (map != null) {
            iE += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(3, map);
        }
        return ProtoAdapter.STRING.encodedSizeWithTag(4, pi3Var.G) + iE;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        pi3 pi3Var = (pi3) obj;
        pi3Var.getClass();
        Map<String, ?> map = pi3Var.H;
        Map<String, ?> mapRedact = map != null ? ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ByteString byteString = ByteString.H;
        String str = pi3Var.E;
        String str2 = pi3Var.F;
        String str3 = pi3Var.G;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new pi3(str, str2, mapRedact, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        pi3 pi3Var = (pi3) obj;
        reverseProtoWriter.getClass();
        pi3Var.getClass();
        String str = pi3Var.E;
        String str2 = pi3Var.F;
        reverseProtoWriter.writeBytes(pi3Var.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, pi3Var.G);
        Map<String, ?> map = pi3Var.H;
        if (map != null) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 3, map);
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
