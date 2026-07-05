package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class j94 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        int iIntValue = 0;
        String strDecode = "";
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new k94(iIntValue, strDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                iIntValue = ProtoAdapter.INT32.decode(protoReader).intValue();
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        k94 k94Var = (k94) obj;
        protoWriter.getClass();
        k94Var.getClass();
        String str = k94Var.F;
        int i = k94Var.E;
        if (i != 0) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, Integer.valueOf(i));
        }
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
        }
        protoWriter.writeBytes(k94Var.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        k94 k94Var = (k94) obj;
        k94Var.getClass();
        String str = k94Var.F;
        int iE = k94Var.unknownFields().e();
        int i = k94Var.E;
        if (i != 0) {
            iE += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(i));
        }
        return !x44.r(str, "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) + iE : iE;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        k94 k94Var = (k94) obj;
        k94Var.getClass();
        ByteString byteString = ByteString.H;
        int i = k94Var.E;
        String str = k94Var.F;
        str.getClass();
        byteString.getClass();
        return new k94(i, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        k94 k94Var = (k94) obj;
        reverseProtoWriter.getClass();
        k94Var.getClass();
        reverseProtoWriter.writeBytes(k94Var.unknownFields());
        String str = k94Var.F;
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, str);
        }
        int i = k94Var.E;
        if (i != 0) {
            ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, Integer.valueOf(i));
        }
    }
}
