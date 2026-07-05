package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSeen;
import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSource;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.model.ModelSelectorSurface;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.api.model.f;
import com.anthropic.claude.chat.modelselector.ModelRedirect;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r93 {
    public final wz5 A;
    public final wz5 B;
    public final wz5 C;
    public final wz5 D;
    public final wz5 E;
    public final wz5 F;
    public final wz5 G;
    public final wlg H;
    public final wz5 I;
    public final wz5 J;
    public final t53 a;
    public final pkc b;
    public final xa3 c;
    public final f9 d;
    public final spb e;
    public final q7 f;
    public final lea g;
    public final l45 h;
    public final vd3 i;
    public final qi3 j;
    public final String k;
    public final wlg l;
    public final wz5 m;
    public final wz5 n;
    public final wz5 o;
    public final wz5 p;
    public final wz5 q;
    public final lsc r;
    public final wz5 s;
    public final wz5 t;
    public final wz5 u;
    public final wz5 v;
    public final wz5 w;
    public final wz5 x;
    public final wz5 y;
    public final wz5 z;

    public r93(t53 t53Var, pkc pkcVar, rc8 rc8Var, xa3 xa3Var, f9 f9Var, spb spbVar, q7 q7Var, lea leaVar, mp4 mp4Var, vd3 vd3Var, qi3 qi3Var) {
        mp4Var.getClass();
        this.a = t53Var;
        this.b = pkcVar;
        this.c = xa3Var;
        this.d = f9Var;
        this.e = spbVar;
        this.f = q7Var;
        this.g = leaVar;
        this.h = mp4Var;
        this.i = vd3Var;
        this.j = qi3Var;
        ModelSelectorSurface.Companion.getClass();
        this.k = ModelSelectorSurface.CHAT;
        this.l = rc8Var.m("model_picker_auto_dismiss_enabled");
        a5 a5Var = a5.N;
        final int i = 0;
        this.m = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i2 = 2;
        this.n = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i3 = 3;
        this.o = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i4 = 4;
        this.p = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i5 = 5;
        this.q = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        this.r = mpk.P(null);
        final int i6 = 6;
        this.s = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i7 = 7;
        this.t = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i8 = 1;
        this.u = mpk.x(new n93(this, i8), a5Var);
        final int i9 = 8;
        this.v = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i10 = 9;
        this.w = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i11 = 10;
        this.x = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i12 = 11;
        this.y = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i13 = 12;
        this.z = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i14 = 13;
        this.A = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i15 = 14;
        this.B = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i16 = 15;
        this.C = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i17 = 16;
        this.D = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i18 = 17;
        this.E = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i19 = 18;
        this.F = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        final int i20 = 19;
        this.G = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
        this.H = rc8Var.g("claude_ai_model_redirects", new f7a(ModelId.Companion.serializer(), ModelRedirect.Companion.serializer()));
        this.I = mpk.x(new n93(this, i), a5Var);
        this.J = mpk.x(new zy7(this) { // from class: m93
            public final /* synthetic */ r93 F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 2006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m93.a():java.lang.Object");
            }
        }, a5Var);
    }

    public final fkg a(ModelSelection modelSelection) {
        modelSelection.getClass();
        return gb9.D(this.h, null, null, new tm(this, modelSelection, null, 18), 3);
    }

    public final ModelSelectorEntry b(String str) {
        Object next;
        str.getClass();
        Iterator it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ModelId.m1061equalsimpl0(((ModelSelectorEntry) next).m364getIdi4oh0I(), str)) {
                break;
            }
        }
        return (ModelSelectorEntry) next;
    }

    public final List c() {
        return (List) this.n.getValue();
    }

    public final String d() {
        ThinkingState thinkingState;
        if (!j() || (thinkingState = (ThinkingState) this.y.getValue()) == null) {
            return null;
        }
        return f.b(thinkingState);
    }

    public final String e() {
        ModelId modelId = (ModelId) this.u.getValue();
        if (modelId != null) {
            return modelId.m1064unboximpl();
        }
        return null;
    }

    public final okc f() {
        return this.b.a();
    }

    public final String g() {
        ThinkingEffort thinkingEffort;
        ThinkingOption thinkingOption = (ThinkingOption) this.E.getValue();
        if (thinkingOption == null || (thinkingEffort = (ThinkingEffort) thinkingOption.getId()) == null) {
            return null;
        }
        return thinkingEffort.m1141unboximpl();
    }

    public final ihf h() {
        return (ihf) this.t.getValue();
    }

    public final boolean i() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0171  */
    /* JADX WARN: Type inference failed for: r11v0, types: [mq5] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.anthropic.claude.api.model.ThinkingState r14, defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r93.k(com.anthropic.claude.api.model.ThinkingState, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r18.i.s(r1, r2, r7) == r13) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r19, defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r93.l(java.lang.String, vp4):java.lang.Object");
    }

    public final void m(String str) {
        this.r.setValue(str != null ? ModelId.m1058boximpl(str) : null);
    }

    public final void n(ChatEvents$ModelSelectorSheetSource chatEvents$ModelSelectorSheetSource) {
        chatEvents$ModelSelectorSheetSource.getClass();
        t53 t53Var = this.a;
        this.j.e(new ChatEvents$ModelSelectorSheetSeen(t53Var.d.e, chatEvents$ModelSelectorSheetSource, Boolean.valueOf(t53Var.a1())), ChatEvents$ModelSelectorSheetSeen.Companion.serializer());
    }
}
