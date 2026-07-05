package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class fv8 extends yuj {
    public static final Pattern j = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder h = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder i = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.yuj
    public final gjb d(mjb mjbVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.i;
        CharsetDecoder charsetDecoder2 = this.h;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new gjb(new hv8(bArr, null, null));
        }
        Matcher matcher = j.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM = auk.m(strGroup);
                strM.getClass();
                if (strM.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new gjb(new hv8(bArr, str, str2));
    }
}
