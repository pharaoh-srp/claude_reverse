package defpackage;

import com.anthropic.claude.sessions.types.ShareRecord;
import com.anthropic.claude.sessions.types.ShareStatus;
import com.anthropic.claude.sessions.types.ShareVisibilityType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m1g implements w28 {
    public static final m1g a;
    private static final SerialDescriptor descriptor;

    static {
        m1g m1gVar = new m1g();
        a = m1gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.ShareRecord", m1gVar, 4);
        pluginGeneratedSerialDescriptor.j("share_id", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("visibility_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ShareRecord.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kw9VarArr[1].getValue(), srgVar, d4c.S((KSerializer) kw9VarArr[3].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ShareRecord.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        ShareStatus shareStatus = null;
        String strV2 = null;
        ShareVisibilityType shareVisibilityType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                shareStatus = (ShareStatus) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), shareStatus);
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                shareVisibilityType = (ShareVisibilityType) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), shareVisibilityType);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ShareRecord(i, strV, shareStatus, strV2, shareVisibilityType, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ShareRecord shareRecord = (ShareRecord) obj;
        encoder.getClass();
        shareRecord.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ShareRecord.write$Self$sessions(shareRecord, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
