package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        Map<String, ?> mapDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new a0d(strDecode, strDecode2, mapDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                mapDecode = ProtoAdapter.STRUCT_MAP.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        a0d a0dVar = (a0d) obj;
        protoWriter.getClass();
        a0dVar.getClass();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, a0dVar.E);
        protoAdapter.encodeWithTag(protoWriter, 2, a0dVar.F);
        Map<String, ?> map = a0dVar.G;
        if (map != null) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 3, map);
        }
        protoWriter.writeBytes(a0dVar.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        a0d a0dVar = (a0d) obj;
        a0dVar.getClass();
        int iE = a0dVar.unknownFields().e();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, a0dVar.F) + protoAdapter.encodedSizeWithTag(1, a0dVar.E) + iE;
        Map<String, ?> map = a0dVar.G;
        return map != null ? ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(3, map) + iEncodedSizeWithTag : iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        a0d a0dVar = (a0d) obj;
        a0dVar.getClass();
        Map<String, ?> map = a0dVar.G;
        Map<String, ?> mapRedact = map != null ? ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ByteString byteString = ByteString.H;
        String str = a0dVar.E;
        String str2 = a0dVar.F;
        byteString.getClass();
        return new a0d(str, str2, mapRedact, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        a0d a0dVar = (a0d) obj;
        reverseProtoWriter.getClass();
        a0dVar.getClass();
        reverseProtoWriter.writeBytes(a0dVar.unknownFields());
        Map<String, ?> map = a0dVar.G;
        if (map != null) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 3, map);
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, a0dVar.F);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, a0dVar.E);
    }
}
