package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class x8i extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new y8i(strDecode, strDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
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
        y8i y8iVar = (y8i) obj;
        protoWriter.getClass();
        y8iVar.getClass();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, y8iVar.E);
        protoAdapter.encodeWithTag(protoWriter, 2, y8iVar.F);
        protoWriter.writeBytes(y8iVar.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        y8i y8iVar = (y8i) obj;
        y8iVar.getClass();
        int iE = y8iVar.unknownFields().e();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, y8iVar.F) + protoAdapter.encodedSizeWithTag(1, y8iVar.E) + iE;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        y8i y8iVar = (y8i) obj;
        y8iVar.getClass();
        ByteString byteString = ByteString.H;
        String str = y8iVar.E;
        String str2 = y8iVar.F;
        byteString.getClass();
        return new y8i(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        y8i y8iVar = (y8i) obj;
        reverseProtoWriter.getClass();
        y8iVar.getClass();
        reverseProtoWriter.writeBytes(y8iVar.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, y8iVar.F);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, y8iVar.E);
    }
}
