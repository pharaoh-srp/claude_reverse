package com.anthropic.claude.app;

import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.app.ClaudeAppOverlay;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.znf;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements w28 {
    public static final x0 a;
    private static final SerialDescriptor descriptor;

    static {
        x0 x0Var = new x0();
        a = x0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppOverlay.GroveNoticeBottomSheet", x0Var, 1);
        pluginGeneratedSerialDescriptor.j("location", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ClaudeAppOverlay.GroveNoticeBottomSheet.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ClaudeAppOverlay.GroveNoticeBottomSheet.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        GroveEvents$GroveLocation groveEvents$GroveLocation = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                groveEvents$GroveLocation = (GroveEvents$GroveLocation) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), groveEvents$GroveLocation);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppOverlay.GroveNoticeBottomSheet(i, groveEvents$GroveLocation, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppOverlay.GroveNoticeBottomSheet groveNoticeBottomSheet = (ClaudeAppOverlay.GroveNoticeBottomSheet) obj;
        encoder.getClass();
        groveNoticeBottomSheet.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) ClaudeAppOverlay.GroveNoticeBottomSheet.$childSerializers[0].getValue(), groveNoticeBottomSheet.location);
        vd4VarC.b(serialDescriptor);
    }
}
