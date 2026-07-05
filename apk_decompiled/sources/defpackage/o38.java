package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class o38 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        Map<String, ?> mapDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new p38(mapDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                mapDecode = ProtoAdapter.STRUCT_MAP.decode(protoReader);
            } else {
                protoReader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        p38 p38Var = (p38) obj;
        protoWriter.getClass();
        p38Var.getClass();
        Map<String, ?> map = p38Var.E;
        if (map != null) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 1, map);
        }
        protoWriter.writeBytes(p38Var.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        p38 p38Var = (p38) obj;
        p38Var.getClass();
        int iE = p38Var.unknownFields().e();
        Map<String, ?> map = p38Var.E;
        return map != null ? ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, map) + iE : iE;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        p38 p38Var = (p38) obj;
        p38Var.getClass();
        Map<String, ?> map = p38Var.E;
        Map<String, ?> mapRedact = map != null ? ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ByteString byteString = ByteString.H;
        byteString.getClass();
        return new p38(mapRedact, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        p38 p38Var = (p38) obj;
        reverseProtoWriter.getClass();
        p38Var.getClass();
        reverseProtoWriter.writeBytes(p38Var.unknownFields());
        Map<String, ?> map = p38Var.E;
        if (map != null) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 1, map);
        }
    }
}
