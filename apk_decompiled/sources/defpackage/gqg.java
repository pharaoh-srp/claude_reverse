package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class gqg extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        Object objDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new hqg(strDecode, (k94) objDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
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
        hqg hqgVar = (hqg) obj;
        protoWriter.getClass();
        hqgVar.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hqgVar.E);
        k94.G.encodeWithTag(protoWriter, 2, hqgVar.F);
        protoWriter.writeBytes(hqgVar.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        hqg hqgVar = (hqg) obj;
        hqgVar.getClass();
        return k94.G.encodedSizeWithTag(2, hqgVar.F) + ProtoAdapter.STRING.encodedSizeWithTag(1, hqgVar.E) + hqgVar.unknownFields().e();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        hqg hqgVar = (hqg) obj;
        hqgVar.getClass();
        k94 k94Var = hqgVar.F;
        k94 k94Var2 = k94Var != null ? (k94) k94.G.redact(k94Var) : null;
        ByteString byteString = ByteString.H;
        String str = hqgVar.E;
        byteString.getClass();
        return new hqg(str, k94Var2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        hqg hqgVar = (hqg) obj;
        reverseProtoWriter.getClass();
        hqgVar.getClass();
        reverseProtoWriter.writeBytes(hqgVar.unknownFields());
        k94.G.encodeWithTag(reverseProtoWriter, 2, hqgVar.F);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, hqgVar.E);
    }
}
