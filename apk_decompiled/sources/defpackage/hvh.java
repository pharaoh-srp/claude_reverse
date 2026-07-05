package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class hvh extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        Object objDecode = null;
        Object objDecode2 = null;
        Object objDecode3 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new kvh((pi3) objDecode, (wy7) objDecode2, (td0) objDecode3, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                objDecode = pi3.I.decode(protoReader);
            } else if (iNextTag == 2) {
                objDecode2 = wy7.P.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                objDecode3 = td0.G.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        kvh kvhVar = (kvh) obj;
        protoWriter.getClass();
        kvhVar.getClass();
        pi3.I.encodeWithTag(protoWriter, 1, kvhVar.E);
        wy7.P.encodeWithTag(protoWriter, 2, kvhVar.F);
        td0.G.encodeWithTag(protoWriter, 3, kvhVar.G);
        protoWriter.writeBytes(kvhVar.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        kvh kvhVar = (kvh) obj;
        kvhVar.getClass();
        return td0.G.encodedSizeWithTag(3, kvhVar.G) + wy7.P.encodedSizeWithTag(2, kvhVar.F) + pi3.I.encodedSizeWithTag(1, kvhVar.E) + kvhVar.unknownFields().e();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        kvh kvhVar = (kvh) obj;
        kvhVar.getClass();
        pi3 pi3Var = kvhVar.E;
        pi3 pi3Var2 = pi3Var != null ? (pi3) pi3.I.redact(pi3Var) : null;
        wy7 wy7Var = kvhVar.F;
        wy7 wy7Var2 = wy7Var != null ? (wy7) wy7.P.redact(wy7Var) : null;
        td0 td0Var = kvhVar.G;
        td0 td0Var2 = td0Var != null ? (td0) td0.G.redact(td0Var) : null;
        ByteString byteString = ByteString.H;
        byteString.getClass();
        return new kvh(pi3Var2, wy7Var2, td0Var2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        kvh kvhVar = (kvh) obj;
        reverseProtoWriter.getClass();
        kvhVar.getClass();
        reverseProtoWriter.writeBytes(kvhVar.unknownFields());
        td0.G.encodeWithTag(reverseProtoWriter, 3, kvhVar.G);
        wy7.P.encodeWithTag(reverseProtoWriter, 2, kvhVar.F);
        pi3.I.encodeWithTag(reverseProtoWriter, 1, kvhVar.E);
    }
}
