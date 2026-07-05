package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.types.strings.ModelId;
import defpackage.d4c;
import defpackage.fji;
import defpackage.kw9;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements w28 {
    public static final f1 a;
    private static final SerialDescriptor descriptor;

    static {
        f1 f1Var = new f1();
        a = f1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppOverlay.UpgradeToProBottomSheet", f1Var, 3);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("initialPromptAfterUpgrade", true);
        pluginGeneratedSerialDescriptor.j("modelIdToSelectAfterUpgrade", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ClaudeAppOverlay.UpgradeToProBottomSheet.$childSerializers[0].getValue(), d4c.S(srg.a), d4c.S(vnb.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ClaudeAppOverlay.UpgradeToProBottomSheet.$childSerializers;
        boolean z = true;
        int i = 0;
        fji fjiVar = null;
        String str = null;
        String strM1064unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                fjiVar = (fji) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), fjiVar);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                ModelId modelId = (ModelId) ud4VarC.m(serialDescriptor, 2, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppOverlay.UpgradeToProBottomSheet(i, fjiVar, str, strM1064unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppOverlay.UpgradeToProBottomSheet upgradeToProBottomSheet = (ClaudeAppOverlay.UpgradeToProBottomSheet) obj;
        encoder.getClass();
        upgradeToProBottomSheet.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClaudeAppOverlay.UpgradeToProBottomSheet.write$Self$app(upgradeToProBottomSheet, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
