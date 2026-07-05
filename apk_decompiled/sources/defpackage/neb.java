package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class neb extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = "";
        String strDecode2 = "";
        int iIntValue = 0;
        String strDecode3 = strDecode2;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new peb(strDecode, iIntValue, strDecode3, strDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                iIntValue = ProtoAdapter.INT32.decode(protoReader).intValue();
            } else if (iNextTag == 3) {
                strDecode3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 4) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        peb pebVar = (peb) obj;
        protoWriter.getClass();
        pebVar.getClass();
        String str = pebVar.H;
        String str2 = pebVar.G;
        String str3 = pebVar.E;
        if (!x44.r(str3, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str3);
        }
        int i = pebVar.F;
        if (i != 0) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, Integer.valueOf(i));
        }
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str2);
        }
        if (!x44.r(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
        }
        protoWriter.writeBytes(pebVar.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        peb pebVar = (peb) obj;
        pebVar.getClass();
        String str = pebVar.H;
        String str2 = pebVar.G;
        int iE = pebVar.unknownFields().e();
        String str3 = pebVar.E;
        if (!x44.r(str3, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(1, str3);
        }
        int i = pebVar.F;
        if (i != 0) {
            iE += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(i));
        }
        if (!x44.r(str2, "")) {
            iE += ProtoAdapter.STRING.encodedSizeWithTag(3, str2);
        }
        return !x44.r(str, "") ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) + iE : iE;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        peb pebVar = (peb) obj;
        pebVar.getClass();
        ByteString byteString = ByteString.H;
        String str = pebVar.E;
        int i = pebVar.F;
        String str2 = pebVar.G;
        String str3 = pebVar.H;
        str.getClass();
        str2.getClass();
        str3.getClass();
        byteString.getClass();
        return new peb(str, i, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws EOFException {
        peb pebVar = (peb) obj;
        reverseProtoWriter.getClass();
        pebVar.getClass();
        String str = pebVar.E;
        String str2 = pebVar.G;
        reverseProtoWriter.writeBytes(pebVar.unknownFields());
        String str3 = pebVar.H;
        if (!x44.r(str3, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, str3);
        }
        if (!x44.r(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, str2);
        }
        int i = pebVar.F;
        if (i != 0) {
            ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, Integer.valueOf(i));
        }
        if (x44.r(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }
}
