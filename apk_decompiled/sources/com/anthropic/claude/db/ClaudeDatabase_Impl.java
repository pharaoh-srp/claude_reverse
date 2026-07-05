package com.anthropic.claude.db;

import com.anthropic.claude.db.ClaudeDatabase_Impl;
import defpackage.cl6;
import defpackage.e62;
import defpackage.h62;
import defpackage.imd;
import defpackage.jce;
import defpackage.kce;
import defpackage.ll3;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.pl9;
import defpackage.u0h;
import defpackage.vb9;
import defpackage.w52;
import defpackage.zs2;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/anthropic/claude/db/ClaudeDatabase_Impl;", "Lcom/anthropic/claude/db/ClaudeDatabase;", "<init>", "()V", "database"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ClaudeDatabase_Impl extends ClaudeDatabase {
    public final u0h l;
    public final u0h m;
    public final u0h n;
    public final u0h o;
    public final u0h p;

    public ClaudeDatabase_Impl() {
        final int i = 0;
        this.l = new u0h(new zy7(this) { // from class: kl3
            public final /* synthetic */ ClaudeDatabase_Impl F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                ClaudeDatabase_Impl claudeDatabase_Impl = this.F;
                switch (i2) {
                    case 0:
                        return new e62(claudeDatabase_Impl);
                    case 1:
                        return new w52(claudeDatabase_Impl);
                    case 2:
                        return new zs2(claudeDatabase_Impl);
                    case 3:
                        return new h62(claudeDatabase_Impl);
                    default:
                        return new imd(claudeDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.m = new u0h(new zy7(this) { // from class: kl3
            public final /* synthetic */ ClaudeDatabase_Impl F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                ClaudeDatabase_Impl claudeDatabase_Impl = this.F;
                switch (i22) {
                    case 0:
                        return new e62(claudeDatabase_Impl);
                    case 1:
                        return new w52(claudeDatabase_Impl);
                    case 2:
                        return new zs2(claudeDatabase_Impl);
                    case 3:
                        return new h62(claudeDatabase_Impl);
                    default:
                        return new imd(claudeDatabase_Impl);
                }
            }
        });
        final int i3 = 2;
        this.n = new u0h(new zy7(this) { // from class: kl3
            public final /* synthetic */ ClaudeDatabase_Impl F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                ClaudeDatabase_Impl claudeDatabase_Impl = this.F;
                switch (i22) {
                    case 0:
                        return new e62(claudeDatabase_Impl);
                    case 1:
                        return new w52(claudeDatabase_Impl);
                    case 2:
                        return new zs2(claudeDatabase_Impl);
                    case 3:
                        return new h62(claudeDatabase_Impl);
                    default:
                        return new imd(claudeDatabase_Impl);
                }
            }
        });
        final int i4 = 3;
        this.o = new u0h(new zy7(this) { // from class: kl3
            public final /* synthetic */ ClaudeDatabase_Impl F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i4;
                ClaudeDatabase_Impl claudeDatabase_Impl = this.F;
                switch (i22) {
                    case 0:
                        return new e62(claudeDatabase_Impl);
                    case 1:
                        return new w52(claudeDatabase_Impl);
                    case 2:
                        return new zs2(claudeDatabase_Impl);
                    case 3:
                        return new h62(claudeDatabase_Impl);
                    default:
                        return new imd(claudeDatabase_Impl);
                }
            }
        });
        final int i5 = 4;
        this.p = new u0h(new zy7(this) { // from class: kl3
            public final /* synthetic */ ClaudeDatabase_Impl F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i5;
                ClaudeDatabase_Impl claudeDatabase_Impl = this.F;
                switch (i22) {
                    case 0:
                        return new e62(claudeDatabase_Impl);
                    case 1:
                        return new w52(claudeDatabase_Impl);
                    case 2:
                        return new zs2(claudeDatabase_Impl);
                    case 3:
                        return new h62(claudeDatabase_Impl);
                    default:
                        return new imd(claudeDatabase_Impl);
                }
            }
        });
    }

    @Override // defpackage.cve
    public final List c(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.cve
    public final vb9 d() {
        return new vb9(this, new LinkedHashMap(), new LinkedHashMap(), "cachedMessages", "cachedConversations", "chatIdListEntries", "cachedProjects", "projectIdListEntries");
    }

    @Override // defpackage.cve
    public final cl6 e() {
        return new ll3(this);
    }

    @Override // defpackage.cve
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // defpackage.cve
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kce kceVar = jce.a;
        pl9 pl9VarB = kceVar.b(e62.class);
        lm6 lm6Var = lm6.E;
        linkedHashMap.put(pl9VarB, lm6Var);
        linkedHashMap.put(kceVar.b(w52.class), lm6Var);
        linkedHashMap.put(kceVar.b(zs2.class), lm6Var);
        linkedHashMap.put(kceVar.b(h62.class), lm6Var);
        linkedHashMap.put(kceVar.b(imd.class), lm6Var);
        return linkedHashMap;
    }

    @Override // com.anthropic.claude.db.ClaudeDatabase
    public final w52 r() {
        return (w52) this.m.getValue();
    }

    @Override // com.anthropic.claude.db.ClaudeDatabase
    public final e62 s() {
        return (e62) this.l.getValue();
    }

    @Override // com.anthropic.claude.db.ClaudeDatabase
    public final h62 t() {
        return (h62) this.o.getValue();
    }

    @Override // com.anthropic.claude.db.ClaudeDatabase
    public final zs2 u() {
        return (zs2) this.n.getValue();
    }

    @Override // com.anthropic.claude.db.ClaudeDatabase
    public final imd v() {
        return (imd) this.p.getValue();
    }
}
