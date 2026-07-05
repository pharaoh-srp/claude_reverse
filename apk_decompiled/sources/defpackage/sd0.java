package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class sd0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = "";
        String strDecode2 = "";
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new td0(strDecode, strDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
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
        td0 td0Var = (td0) obj;
        protoWriter.getClass();
        td0Var.getClass();
        String str = td0Var.F;
        String str2 = td0Var.E;
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str2);
        }
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
        }
        protoWriter.writeBytes(td0Var.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        td0 td0Var = (td0) obj;
        td0Var.getClass();
        String str = td0Var.F;
        int iE = td0Var.unknownFields().e();
        String str2 = td0Var.E;
        if (!x44.r(str2, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(1, str2);
        }
        return !x44.r(str, "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) + iE : iE;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        td0 td0Var = (td0) obj;
        td0Var.getClass();
        ByteString byteString = ByteString.H;
        String str = td0Var.E;
        String str2 = td0Var.F;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new td0(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        td0 td0Var = (td0) obj;
        reverseProtoWriter.getClass();
        td0Var.getClass();
        String str = td0Var.E;
        reverseProtoWriter.writeBytes(td0Var.unknownFields());
        String str2 = td0Var.F;
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, str2);
        }
        if (x44.r(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }
}
