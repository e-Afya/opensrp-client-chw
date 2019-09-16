package org.smartregister.brac.hnpp.activity;

import android.content.Intent;

import org.smartregister.chw.core.activity.CoreChildRegisterActivity;
import org.smartregister.brac.hnpp.fragment.ChildRegisterFragment;
import org.smartregister.view.fragment.BaseRegisterFragment;

public class ChildRegisterActivity extends CoreChildRegisterActivity {
    @Override
    protected BaseRegisterFragment getRegisterFragment() {
        return new ChildRegisterFragment();
    }

    @Override
    public void switchToBaseFragment() {
        Intent intent = new Intent(this, FamilyRegisterActivity.class);
        startActivity(intent);
        finish();
    }
}