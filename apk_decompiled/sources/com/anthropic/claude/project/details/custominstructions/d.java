package com.anthropic.claude.project.details.custominstructions;

import com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute;
import defpackage.cjh;
import defpackage.h86;
import defpackage.iwe;
import defpackage.koi;
import defpackage.lsc;
import defpackage.mkd;
import defpackage.mpk;
import defpackage.mwa;
import defpackage.wqd;
import defpackage.x44;
import defpackage.zy1;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends iwe {
    public final CustomInstructionsDialogRoute.EditCustomInstructions b;
    public final koi c;
    public final wqd d;
    public final mkd e;
    public final zy1 f;
    public final lsc g;
    public final lsc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CustomInstructionsDialogRoute.EditCustomInstructions editCustomInstructions, koi koiVar, wqd wqdVar, mkd mkdVar, h86 h86Var) {
        super(h86Var);
        editCustomInstructions.getClass();
        this.b = editCustomInstructions;
        this.c = koiVar;
        this.d = wqdVar;
        this.e = mkdVar;
        this.f = x44.a();
        this.g = mpk.P(Boolean.FALSE);
        String instructions = editCustomInstructions.getInstructions();
        int length = editCustomInstructions.getInstructions().length();
        this.h = mpk.P(new cjh(instructions, mwa.m(length, length), 4));
    }
}
