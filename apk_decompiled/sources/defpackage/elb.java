package defpackage;

import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.tool.model.PreviewData;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class elb implements w28 {
    public static final elb a;
    private static final SerialDescriptor descriptor;

    static {
        elb elbVar = new elb();
        a = elbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.MobileAppToolPreviewInfo", elbVar, 4);
        pluginGeneratedSerialDescriptor.j("iconRes", false);
        pluginGeneratedSerialDescriptor.j("toolLabel", false);
        pluginGeneratedSerialDescriptor.j("toolDescription", false);
        pluginGeneratedSerialDescriptor.j("previewData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) MobileAppToolPreviewInfo.$childSerializers[3].getValue());
        srg srgVar = srg.a;
        return new KSerializer[]{e79.a, srgVar, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MobileAppToolPreviewInfo.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        String strV2 = null;
        PreviewData previewData = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                previewData = (PreviewData) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), previewData);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MobileAppToolPreviewInfo(i, iR, strV, strV2, previewData, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileAppToolPreviewInfo mobileAppToolPreviewInfo = (MobileAppToolPreviewInfo) obj;
        encoder.getClass();
        mobileAppToolPreviewInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileAppToolPreviewInfo.write$Self$tool(mobileAppToolPreviewInfo, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
