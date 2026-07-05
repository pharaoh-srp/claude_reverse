package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class bn0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        Object objDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new cn0(strDecode, (k94) objDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                objDecode = k94.G.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        cn0 cn0Var = (cn0) obj;
        protoWriter.getClass();
        cn0Var.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cn0Var.E);
        k94.G.encodeWithTag(protoWriter, 2, cn0Var.F);
        protoWriter.writeBytes(cn0Var.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        cn0 cn0Var = (cn0) obj;
        cn0Var.getClass();
        return k94.G.encodedSizeWithTag(2, cn0Var.F) + ProtoAdapter.STRING.encodedSizeWithTag(1, cn0Var.E) + cn0Var.unknownFields().e();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        cn0 cn0Var = (cn0) obj;
        cn0Var.getClass();
        k94 k94Var = cn0Var.F;
        k94 k94Var2 = k94Var != null ? (k94) k94.G.redact(k94Var) : null;
        ByteString byteString = ByteString.H;
        String str = cn0Var.E;
        byteString.getClass();
        return new cn0(str, k94Var2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        cn0 cn0Var = (cn0) obj;
        reverseProtoWriter.getClass();
        cn0Var.getClass();
        reverseProtoWriter.writeBytes(cn0Var.unknownFields());
        k94.G.encodeWithTag(reverseProtoWriter, 2, cn0Var.F);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cn0Var.E);
    }
}
