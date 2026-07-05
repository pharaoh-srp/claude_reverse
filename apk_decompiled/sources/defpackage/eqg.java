package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class eqg extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = "";
        String strDecode2 = "";
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new fqg(strDecode, strDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        fqg fqgVar = (fqg) obj;
        protoWriter.getClass();
        fqgVar.getClass();
        String str = fqgVar.F;
        String str2 = fqgVar.E;
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str2);
        }
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
        }
        protoWriter.writeBytes(fqgVar.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        fqg fqgVar = (fqg) obj;
        fqgVar.getClass();
        String str = fqgVar.F;
        int iE = fqgVar.unknownFields().e();
        String str2 = fqgVar.E;
        if (!x44.r(str2, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(1, str2);
        }
        return !x44.r(str, "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) + iE : iE;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        fqg fqgVar = (fqg) obj;
        fqgVar.getClass();
        ByteString byteString = ByteString.H;
        String str = fqgVar.E;
        String str2 = fqgVar.F;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new fqg(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        fqg fqgVar = (fqg) obj;
        reverseProtoWriter.getClass();
        fqgVar.getClass();
        String str = fqgVar.E;
        reverseProtoWriter.writeBytes(fqgVar.unknownFields());
        String str2 = fqgVar.F;
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, str2);
        }
        if (x44.r(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }
}
