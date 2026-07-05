package defpackage;

import com.anthropic.claude.api.wiggle.PrepareUploadResult;
import com.anthropic.claude.types.strings.FileId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wcd implements w28 {
    public static final wcd a;
    private static final SerialDescriptor descriptor;

    static {
        wcd wcdVar = new wcd();
        a = wcdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.wiggle.PrepareUploadResult", wcdVar, 3);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j("filesystem_id", false);
        pluginGeneratedSerialDescriptor.j("path", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{oi7.a, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1020unboximpl = null;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                FileId fileId = (FileId) ud4VarC.l(serialDescriptor, 0, oi7.a, strM1020unboximpl != null ? FileId.m1014boximpl(strM1020unboximpl) : null);
                strM1020unboximpl = fileId != null ? fileId.m1020unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PrepareUploadResult(i, strM1020unboximpl, strV, strV2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PrepareUploadResult prepareUploadResult = (PrepareUploadResult) obj;
        encoder.getClass();
        prepareUploadResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PrepareUploadResult.write$Self$api(prepareUploadResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
