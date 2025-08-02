package com.yourorg.library.Service.implementation;
import com.yourorg.library.Config.ExcludeFromScan;
import org.springframework.stereotype.Service;

@ExcludeFromScan
@Service
public class DeprecatedFeatureService {
    public String runLogic() {
        return "Should not be in the context";
    }
}