package com.anthropic.claude.chat.input.images;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.bpc;
import defpackage.cv9;
import defpackage.efe;
import defpackage.hr1;
import defpackage.ib2;
import defpackage.mdj;
import defpackage.qk7;
import defpackage.xd6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/chat/input/images/ImagePlaceholderPainter;", "Lbpc;", "input"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
final class ImagePlaceholderPainter extends bpc {
    public final long J;
    public final bpc K;
    public final float L;
    public final long M;
    public final hr1 N;

    public ImagePlaceholderPainter(long j, bpc bpcVar, long j2) {
        bpcVar.getClass();
        this.J = j;
        this.K = bpcVar;
        this.L = 32.0f;
        this.M = 9205357640488583168L;
        this.N = new hr1(j2, 5);
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getM() {
        return this.M;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        cv9Var.T0(this.J, 0L, (58 & 4) != 0 ? xd6.h0(cv9Var.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
        float fQ0 = cv9Var.q0(this.L);
        ib2 ib2Var = cv9Var.E;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (ib2Var.g() >> 32)) - fQ0) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)) - fQ0) / 2.0f;
        ((efe) ib2Var.F.E).G(fIntBitsToFloat, fIntBitsToFloat2);
        try {
            bpc.h(this.K, cv9Var, (((long) Float.floatToRawIntBits(fQ0)) << 32) | (((long) Float.floatToRawIntBits(fQ0)) & 4294967295L), this.N, 2);
        } finally {
            ((efe) ib2Var.F.E).G(-fIntBitsToFloat, -fIntBitsToFloat2);
        }
    }
}
