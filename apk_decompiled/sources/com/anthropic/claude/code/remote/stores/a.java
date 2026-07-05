package com.anthropic.claude.code.remote.stores;

import android.content.SharedPreferences;
import com.anthropic.claude.sessions.types.CoworkSafetyFlag;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.types.strings.CodeAgentId;
import defpackage.bg9;
import defpackage.f7a;
import defpackage.hre;
import defpackage.iuj;
import defpackage.lm6;
import defpackage.lsc;
import defpackage.mpk;
import defpackage.n30;
import defpackage.nm6;
import defpackage.sfa;
import defpackage.sq6;
import defpackage.srg;
import defpackage.uo0;
import defpackage.x44;
import defpackage.yfa;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final SharedPreferences a;
    public final bg9 b;
    public final lsc c;
    public final lsc d;
    public final lsc e;
    public final lsc f;
    public final lsc g;
    public final lsc h;
    public final lsc i;

    public a(SharedPreferences sharedPreferences, bg9 bg9Var) {
        this.a = sharedPreferences;
        this.b = bg9Var;
        String string = sharedPreferences.getString("default_agent_id", null);
        String strM993constructorimpl = string != null ? CodeAgentId.m993constructorimpl(string) : null;
        this.c = mpk.P(strM993constructorimpl != null ? CodeAgentId.m992boximpl(strM993constructorimpl) : null);
        this.d = sq6.l(sharedPreferences, "debug_force_github_disconnected", false);
        this.e = sq6.l(sharedPreferences, "debug_force_empty_session_list", false);
        this.f = sq6.l(sharedPreferences, "debug_starter_session_picker", false);
        this.g = sq6.l(sharedPreferences, "debug_force_no_environments", false);
        this.h = sq6.l(sharedPreferences, "auto_mode_opted_in", false);
        this.i = sq6.l(sharedPreferences, "auto_default_notice_seen", false);
    }

    public final void a() {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.remove("onboarding_completed");
        editorEdit.remove("github_connected");
        editorEdit.remove("default_environment");
        editorEdit.remove("default_session_target");
        editorEdit.remove("default_repo");
        editorEdit.remove("default_repos");
        editorEdit.remove("notification_prompt_seen");
        editorEdit.remove("cowork_starter_seen");
        editorEdit.apply();
    }

    public final Map b() {
        Object hreVar;
        String string = this.a.getString("cowork_safety_flags_v1", null);
        if (string != null) {
            try {
                hreVar = (Map) this.b.b(string, new f7a(srg.a, new uo0(CoworkSafetyFlag.Companion.serializer(), 0)));
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            Map map = (Map) (hreVar instanceof hre ? null : hreVar);
            if (map != null) {
                return map;
            }
        }
        return nm6.E;
    }

    public final boolean c() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final GitHubRepo e() {
        String string = this.a.getString("default_repo", null);
        if (string != null) {
            try {
                return (GitHubRepo) this.b.b(string, GitHubRepo.Companion.serializer());
            } catch (Exception e) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(this);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        String strQ = sq6.q(zfa.a, e, "Failed to decode default repo: ");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strQ);
                        }
                    }
                }
            }
        }
        return null;
    }

    public final List f() {
        List list = null;
        String string = this.a.getString("default_repos", null);
        if (string != null) {
            try {
                list = (List) this.b.b(string, new uo0(GitHubRepo.Companion.serializer(), 0));
            } catch (Exception e) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(this);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        String strQ = sq6.q(zfa.a, e, "Failed to decode default repos: ");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strQ);
                        }
                    }
                }
            }
            if (list != null) {
                return list;
            }
        }
        GitHubRepo gitHubRepoE = e();
        return gitHubRepoE != null ? x44.W(gitHubRepoE) : lm6.E;
    }

    public final void g(String str) {
        this.c.setValue(str != null ? CodeAgentId.m992boximpl(str) : null);
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (str != null) {
            editorEdit.putString("default_agent_id", str);
        } else {
            editorEdit.remove("default_agent_id");
        }
        editorEdit.apply();
    }

    public final void h(GitHubRepo gitHubRepo) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (gitHubRepo != null) {
            editorEdit.putString("default_repo", this.b.d(gitHubRepo, GitHubRepo.Companion.serializer()));
        } else {
            editorEdit.remove("default_repo");
        }
        editorEdit.apply();
    }

    public final void i(ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (arrayList.isEmpty()) {
            editorEdit.remove("default_repos");
        } else {
            editorEdit.putString("default_repos", this.b.d(arrayList, new uo0(GitHubRepo.Companion.serializer(), 0)));
        }
        editorEdit.apply();
    }
}
