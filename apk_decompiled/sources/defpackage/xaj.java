package defpackage;

import com.anthropic.claude.api.wiggle.WiggleFileUploadResponse;
import com.anthropic.claude.types.strings.FileId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xaj implements w28 {
    public static final xaj a;
    private static final SerialDescriptor descriptor;

    static {
        xaj xajVar = new xaj();
        a = xajVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.wiggle.WiggleFileUploadResponse", xajVar, 5);
        pluginGeneratedSerialDescriptor.j("path", false);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j("file_name", false);
        pluginGeneratedSerialDescriptor.j("sanitized_name", false);
        pluginGeneratedSerialDescriptor.j("size_bytes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(xka.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, oi7.a, srgVar, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strM1020unboximpl = null;
        String strV2 = null;
        String strV3 = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                FileId fileId = (FileId) ud4VarC.l(serialDescriptor, 1, oi7.a, strM1020unboximpl != null ? FileId.m1014boximpl(strM1020unboximpl) : null);
                strM1020unboximpl = fileId != null ? fileId.m1020unboximpl() : null;
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                strV3 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                l = (Long) ud4VarC.m(serialDescriptor, 4, xka.a, l);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new WiggleFileUploadResponse(i, strV, strM1020unboximpl, strV2, strV3, l, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WiggleFileUploadResponse wiggleFileUploadResponse = (WiggleFileUploadResponse) obj;
        encoder.getClass();
        wiggleFileUploadResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        WiggleFileUploadResponse.write$Self$api(wiggleFileUploadResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
